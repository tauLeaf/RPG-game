package tau.game;

import tau.game.field.GameField;
import tau.game.util.GameFieldDraw;
import tau.game.units.infantry.factory.SwordsmanFactory;
import tau.game.util.GameFieldIterator;
import tau.game.util.math.MathOperations;
import tau.game.util.math.Point;

public class Main {
    public static void main(String[] args) {
        // Три типа сценариев

        Script.script1();
        System.out.println("================================================\n");

        Script.script2();
        System.out.println("================================================\n");

        Script.script3();
    }
}