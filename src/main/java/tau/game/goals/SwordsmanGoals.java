package tau.game.goals;

import tau.game.GameField;
import tau.game.units.Unit;
import tau.game.units.infantrymen.Swordsman;
import tau.game.util.MathOperations;

import java.awt.*;
import java.util.ArrayDeque;

public class SwordsmanGoals extends Goals {

    public SwordsmanGoals(GameField field) {
        this.field = field;
    }
    @Override
    public void decideWhatToDo() {
//        if (isEnemyNear()) {
//            attackEnemy();
//        }
//        else {
//
//        }
    }

    public boolean isEnemyNear() {
        int x = unit.getX();
        int y = unit.getY();

        return false;
    }

    // ИЗИ ПРОСТО ЛЕГЧАЙШЕ РЕШИЛ ЗА 1.5 ЧАСА РАБОТАЕТ ПОЧТИ С ПЕРВОЙ ПОПЫТКИ
    public void BFS(Unit unit, int x0, int y0) {
        int width = field.getWidth();
        int height = field.getHeight();
        Unit[][] unitsOnField = field.unitsOnField;
        boolean[][] checkedTiles = new boolean[width][height];
        //Maybe ArrayList
        Unit[] pathToUnit = new Unit[MathOperations.getFieldDiagonal(width, height)];
        ArrayDeque<Point> deque = new ArrayDeque<Point>();
        deque.add(new Point(x0, y0));

        Point currentPosition;
        int x, y;
        checkedTiles[y0][x0] = true;
        while (!deque.isEmpty()) {
            currentPosition = deque.remove();
            x = (int) currentPosition.getX();
            y = (int) currentPosition.getY();

            if (x - 1 >= 0) {
                if (!checkedTiles[y][x - 1]) {
                    deque.add(new Point(x - 1, y));
                    checkedTiles[y][x - 1] = true;

                    if (unitsOnField[y][x - 1] != null) {
                        System.out.println("Enemy has found, its position: x = " + (x - 1) + ", y = " + y);
                        return;
                    }
                }
            }
            if (y + 1 < height) {
                if (!checkedTiles[y + 1][x]) {
                    deque.add(new Point(x, y + 1));
                    checkedTiles[y + 1][x] = true;

                    if (unitsOnField[y + 1][x] != null) {
                        System.out.println("Enemy has found, its position: x = " + (x) + ", y = " + (y + 1));
                        return;
                    }
                }
            }
            if (x + 1 < width) {
                if (!checkedTiles[y][x + 1]) {
                    deque.add(new Point(x + 1, y));
                    checkedTiles[y][x + 1] = true;

                    if (unitsOnField[y][x + 1] != null) {
                        System.out.println("Enemy has found, its position: x = " + (x + 1) + ", y = " + (y));
                        return;
                    }
                }
            }
            if (y - 1 >= 0) {
                if (!checkedTiles[y - 1][x]) {
                    deque.add(new Point(x, y - 1));
                    checkedTiles[y - 1][x] = true;

                    if (unitsOnField[y - 1][x] != null) {
                        System.out.println("Enemy has found, its position: x = " + (x) + ", y = " + (y - 1));
                        return;
                    }
                }
            }
        }
    }
}


//
//if (x == field.getWidth()) {
//
//        }
//
//        if (field.unitsOnField[y][x - 1] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y][x + 1] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y + 1][x] != null) {
//        return true;
//        }
//        else if (field.unitsOnField[y - 1][x] != null) {
//        return true;
//        }
//        else {
//        return false;
//        }