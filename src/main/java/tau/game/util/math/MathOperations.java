package tau.game.util.math;

import tau.game.field.GameField;
import tau.game.field.Tile;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class MathOperations {
    public static int getFieldDiagonal(int width, int height) {
        return (int) sqrt(pow(width, 2) + pow(height, 2));
    }

    public static boolean isFieldHadUncheckedTile(Boolean[][] checkedUnits) {
        for (Boolean[] isCheckedLine : checkedUnits) {
            for (Boolean isCheckedTile : isCheckedLine) {
                if (isCheckedTile == false) {
                    return true;
                }
            }
        }
        return false;
    }

    //TODO: ОПТИМИЗИРОВАТЬ
    public static Point BFS(GameField field, Point start) {
        int width = field.getWidth();
        int height = field.getHeight();

        Tile[][] tiles = field.tiles;
        boolean[][] checkedTiles = new boolean[height][width];

        Point[][] paths = new Point[height][width];
        paths[start.getY()][start.getX()] = null;
        ArrayList<Point> path = new ArrayList<>();

        ArrayDeque<Point> deque = new ArrayDeque<>();
        deque.add(start);

        Point currentPosition;
        int x, y;
        checkedTiles[start.getY()][start.getX()] = true;
        while (!deque.isEmpty()) {
            currentPosition = deque.remove();
            x = currentPosition.getX();
            y = currentPosition.getY();

            if (x - 1 >= 0) {
                if (!checkedTiles[y][x - 1]) {
                    deque.add(new Point(x - 1, y));
                    checkedTiles[y][x - 1] = true;

                    paths[y][x - 1] = new Point(x, y);
                    if (tiles[y][x - 1].getUnit() != null) {
                        System.out.println("Enemy has found, its position: x = " + (x - 1) + ", y = " + y);

                        System.out.println("Path:");
                        currentPosition = new Point(x - 1, y);
                        while (currentPosition != null) {
                            path.add(currentPosition);
                            currentPosition = paths[currentPosition.getY()][currentPosition.getX()];
                        }
                        for (Point point : path.reversed()) {
                            System.out.print(point + " ");
                        }
                        return new Point(x - 1, y);
                    }
                }
            }
            if (y + 1 < height) {
                if (!checkedTiles[y + 1][x]) {
                    deque.add(new Point(x, y + 1));
                    checkedTiles[y + 1][x] = true;

                    paths[y + 1][x] = new Point(x, y);
                    if (tiles[y + 1][x].getUnit() != null) {
                        System.out.println("Enemy has found, its position: x = " + (x) + ", y = " + (y + 1));

                        System.out.println("Path:");
                        currentPosition = new Point(x, y + 1);
                        while (currentPosition != null) {
                            path.add(currentPosition);
                            currentPosition = paths[currentPosition.getY()][currentPosition.getX()];
                        }
                        for (Point point : path.reversed()) {
                            System.out.print(point + " ");
                        }
                        return new Point(x, y + 1);
                    }
                }
            }
            if (x + 1 < width) {
                if (!checkedTiles[y][x + 1]) {
                    deque.add(new Point(x + 1, y));
                    checkedTiles[y][x + 1] = true;

                    paths[y][x + 1] = new Point(x, y);
                    if (tiles[y][x + 1].getUnit() != null) {
                        System.out.println("Enemy has found, its position: x = " + (x + 1) + ", y = " + (y));

                        System.out.println("Path:");
                        currentPosition = new Point(x + 1, y);
                        while (currentPosition != null) {
                            path.add(currentPosition);
                            currentPosition = paths[currentPosition.getY()][currentPosition.getX()];
                        }
                        for (Point point : path.reversed()) {
                            System.out.print(point + " ");
                        }
                        return new Point(x + 1, y);
                    }
                }
            }
            if (y - 1 >= 0) {
                if (!checkedTiles[y - 1][x]) {
                    deque.add(new Point(x, y - 1));
                    checkedTiles[y - 1][x] = true;

                    paths[y - 1][x] = new Point(x, y);
                    if (tiles[y - 1][x].getUnit() != null) {
                        System.out.println("Enemy has found, its position: x = " + (x) + ", y = " + (y - 1));

                        System.out.println("Path:");
                        currentPosition = new Point(x, y - 1);
                        while (currentPosition != null) {
                            path.add(currentPosition);
                            currentPosition = paths[currentPosition.getY()][currentPosition.getX()];
                        }
                        for (Point point : path.reversed()) {
                            System.out.print(point + " ");
                        }
                        return new Point(x, y - 1);
                    }
                }
            }
        }
        System.out.println("Enemy has not found...");
        return new Point(-9999, -9999);
    }
}
