package tau.game;

import tau.game.attribute.Move;
import tau.game.units.Unit;
import tau.game.units.UnitFactory;

import java.util.ArrayList;

public class GameField {
    private int width;
    private int height;

    private ArrayList<Unit> units;
    public Tile[][] tiles;
    private int maxUnits;

    public GameField(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Error: width or height is not available.");
            return;
        }
        this.width = width;
        this.height = height;
        this.maxUnits = width * height;
        this.units = new ArrayList<Unit>();

        this.tiles = new Tile[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[y][x] = new Tile(null, null);
            }
        }
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
        (tiles[y][x]).setUnit(unit);

        GameFieldDraw.drawUnits();
    }

    public Unit getUnit(int index) {
        return units.get(index);
    }

    public void removeUnit(int x, int y) {
        Unit unit = tiles[y][x].getUnit();
        if (unit != null) {
            units.remove(unit);
            tiles[y][x].setUnit(null);
        }
    }

    public void moveUnit(Unit unit) {
        Move moveUnit = unit.getMove();
        int speed = moveUnit.getSpeed();
        int x = unit.getX();
        int y = unit.getY();

        Unit temporaryRef = tiles[y][x].getUnit();
        tiles[y][x].setUnit(null);
        switch (moveUnit.getDirection()) {
            case UP -> {
                if (y + speed > height - 1) {
                    tiles[height - 1][x].setUnit(temporaryRef);
                    unit.setY(height - 1);
                }
                else {
                    tiles[y + speed][x].setUnit(temporaryRef);
                    unit.setY(y + speed);
                }
            }
            case DOWN -> {
                if (y - speed < 0) {
                    tiles[0][x].setUnit(temporaryRef);
                    unit.setY(0);
                }
                else {
                    tiles[y - speed][x].setUnit(temporaryRef);
                    unit.setY(y - speed);
                }
            }
            case LEFT -> {
                if (x - speed < 0) {
                    tiles[y][0].setUnit(temporaryRef);
                    unit.setX(0);
                }
                else {
                    tiles[y][x - speed].setUnit(temporaryRef);
                    unit.setX(x - speed);
                }
            }
            case RIGHT -> {
                if (x + speed > width - 1) {
                    tiles[y][width - 1].setUnit(temporaryRef);
                    unit.setX(width - 1);
                }
                else {
                    tiles[y][x + speed].setUnit(temporaryRef);
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
                tiles[y][x] = null;
            }
        }
    }

    public void unitIterator() {

    }
}
