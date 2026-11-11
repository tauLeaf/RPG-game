package tau.game;

import tau.game.units.Unit;
import tau.game.units.infantrymen.Ironclad;
import tau.game.units.infantrymen.Swordsman;

public class GameFieldDraw {
    private static GameField field;

    GameFieldDraw(GameField field) {
        this.field = field;
    }

    public void drawGameField() {
        for (int x = 0; x < field.getWidth() + 2; x++) {
            System.out.print("X  ");
        }
        System.out.println();

        for (int y = 0; y < field.getHeight(); y++) {
            System.out.print("✕");
            for (int x = 1; x < (field.getWidth() - 1) + 2; x++) {
                System.out.print("   ");
            }
            System.out.println("  ✕");
        }

        for (int x = 0; x < field.getWidth() + 2; x++) {
            System.out.print("X  ");
        }
        System.out.println("\n");
    }

    public static void drawUnit(Unit unit, int x0, int y0) {
        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println();

        for (int y = field.getHeight() - 1; y >= 0; y--) {
            System.out.print("✕");
            for (int x = 0; x < field.getWidth(); x++) {
                if (x == x0 && y == y0) {
                    System.out.print("  U");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ✕");
        }

        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println("\n");
    }

    public static void drawUnits() {
        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println();

        for (int y = field.getHeight() - 1; y >= 0; y--) {
            System.out.print("✕");
            for (int x = 0; x < field.getWidth(); x++) {
                drawUnit(field.unitsOnField[y][x]);
            }
            System.out.println("  ✕");
        }

        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println("\n");
    }

    public static void drawUnit(Unit unit) {
        switch (unit) {
            case null -> System.out.print("   ");
            case Swordsman swordsman -> System.out.print("  S");
            case Ironclad ironclad -> System.out.print("  I");
            default -> {
            }
        }
        //TODO: change to SOLID pattern
    }
}
