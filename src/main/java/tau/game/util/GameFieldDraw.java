package tau.game.util;

import tau.game.field.GameField;
import tau.game.field.Tile;
import tau.game.field.terrain.Flat;
import tau.game.field.terrain.Forest;
import tau.game.field.terrain.Hill;
import tau.game.field.terrain.Mountains;
import tau.game.units.cavalry.Chariot;
import tau.game.units.cavalry.Horseman;
import tau.game.units.infantry.Ironclad;
import tau.game.units.infantry.Swordsman;
import tau.game.units.ranged.Crossbowman;
import tau.game.units.ranged.Scout;

public class GameFieldDraw {

    public GameFieldDraw() {

    }

    public static void drawField(GameField field) {
        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println();

        for (int y = field.getHeight() - 1; y >= 0; y--) {
            System.out.print("✕");
            for (int x = 0; x < field.getWidth(); x++) {
                drawTile(field.tiles[y][x]);
            }
            System.out.println("  ✕");
        }

        for (int x = field.getWidth() + 2; x > 0; x--) {
            System.out.print("X  ");
        }
        System.out.println("\n");
    }

    //TODO: change to SOLID pattern
    public static void drawTile(Tile tile) {
        if (tile.getUnit() != null) {
            switch (tile.getUnit()) {
                case Swordsman swordsman -> System.out.print("  S");
                case Ironclad ironclad -> System.out.print("  I");
                case Crossbowman crossbowman -> System.out.print("  C");
                case Scout scout -> System.out.print("  u");
                case Chariot chariot -> System.out.print("  a");
                case Horseman horseman -> System.out.print("  H");
                default -> System.out.print("   ");
            }
        }
        else {
            switch (tile.getTerrain()) {
                case Flat flat -> System.out.print("  -");
                case Forest forest -> System.out.print("  *");
                case Hill hill -> System.out.print("  \"");
                case Mountains mountains -> System.out.print("  ^");
                default -> System.out.print("   !");
            }
        }
    }
}
