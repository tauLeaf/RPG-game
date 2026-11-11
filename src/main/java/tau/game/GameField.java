package tau.game;

import tau.game.attribute.Move;
import tau.game.units.Unit;
import tau.game.units.UnitFactory;

import java.util.ArrayList;

public class GameField {
    private int width;
    private int height;

    public ArrayList<Unit> units;
    public Unit[][] unitsOnField;
    private int maxUnits;

    public GameField(int width, int height, int maxUnits) {
        if (width < 0 || height < 0) {
            System.out.println("Error: width and height is not available.");
            return;
        }
        if (maxUnits < 0 || maxUnits > width * height) {
            System.out.println("Error: maxUnits is not available.");
            return;
        }
        this.width = width;
        this.height = height;
        this.maxUnits = maxUnits;
        this.units = new ArrayList<Unit>();
        unitsOnField = new Unit[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //TODO: реализовать интерфейс Iterator<Unit> (можно в виде внутреннего класса)

    public void addUnit(UnitFactory factory, int x, int y) {
        if (units.size() == maxUnits) {
            System.out.println("Error: maxUnits have been reached.");
            return;
        }
        Unit unit = factory.createUnit(x, y);
        units.add(unit);
        unitsOnField[y][x] = unit;

        GameFieldDraw.drawUnits();
    }

    public Unit getUnit(int index) {
        return units.get(index);
    }

    public void removeUnit(int x, int y) {
        if (unitsOnField[y][x] != null) {
            units.remove(unitsOnField[y][x]);
            unitsOnField[y][x] = null;
        }
    }

    public void moveUnit(Unit unit) {
        Move moveUnit = unit.getMove();
        int speed = moveUnit.getSpeed();
        int x = unit.getX();
        int y = unit.getY();

        Unit temporaryRef = unitsOnField[y][x];
        unitsOnField[y][x] = null;
        switch (moveUnit.getDirection()) {
            case UP -> {
                if (y + speed > height - 1) {
                    unitsOnField[height - 1][x] = temporaryRef;
                    unit.setY(height - 1);
                }
                else {
                    unitsOnField[y + speed][x] = temporaryRef;
                    unit.setY(y + speed);
                }
            }
            case DOWN -> {
                if (y - speed < 0) {
                    unitsOnField[0][x] = temporaryRef;
                    unit.setY(0);
                }
                else {
                    unitsOnField[y - speed][x] = temporaryRef;
                    unit.setY(y - speed);
                }
            }
            case LEFT -> {
                if (x - speed < 0) {
                    unitsOnField[y][0] = temporaryRef;
                    unit.setX(0);
                }
                else {
                    unitsOnField[y][x - speed] = temporaryRef;
                    unit.setX(x - speed);
                }
            }
            case RIGHT -> {
                if (x + speed > width - 1) {
                    unitsOnField[y][width - 1] = temporaryRef;
                    unit.setX(width - 1);
                }
                else {
                    unitsOnField[y][x + speed] = temporaryRef;
                    unit.setX(x + speed);
                }
            }
        }
        GameFieldDraw.drawUnits();
    }

//    public GameField copyGameField(GameField field) {
//
//        return
//    }

    public int size() {
        return units.size();
    }

    public boolean isEmpty() {
        return units.isEmpty();
    }

    public void clear() {
        units.clear();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                unitsOnField[y][x] = null;
            }
        }
    }

    public void unitIterator() {

    }
}
