package tau.game;

import tau.game.field.GameField;
import tau.game.units.UnitFactory;
import tau.game.units.cavalry.factory.ChariotFactory;
import tau.game.units.cavalry.factory.HorsemanFactory;
import tau.game.units.infantry.factory.IroncladFactory;
import tau.game.units.infantry.factory.SwordsmanFactory;
import tau.game.units.ranged.factory.CrossbowmanFactory;
import tau.game.units.ranged.factory.ScoutFactory;
import tau.game.util.GameFieldDraw;
import tau.game.util.GameFieldIterator;
import tau.game.util.math.MathOperations;
import tau.game.util.math.Point;

public class Script {
    public static void script0() {
        GameField field = new GameField(8, 8);
        GameFieldDraw fieldDraw = new GameFieldDraw();

        field.addUnit(new SwordsmanFactory(), 0, 0);
        GameFieldDraw.drawField(field);

        field.addUnit(new SwordsmanFactory(), 0, 7);
        GameFieldDraw.drawField(field);

        field.addUnit(new SwordsmanFactory(), 3, 3);
        GameFieldDraw.drawField(field);

        field.addUnit(new SwordsmanFactory(), 6, 7);
        GameFieldDraw.drawField(field);

        field.addUnit(new SwordsmanFactory(), 3, 4);
        GameFieldDraw.drawField(field);

        System.out.println("\n=================================================\n");

//        field.removeUnit(0);
//        field.removeUnit(0);
//        field.removeUnit(0);

        MathOperations.BFS(field, new Point(7, 7));

        System.out.println("\n=================================================\n");


        GameFieldIterator iterator = new GameFieldIterator(field);
        int i = 0;
        while (iterator.hasNext()) {
            if (i == 1) {
                field.removeUnit(3, 3);
            }
            System.out.println(iterator.next());
            i++;
        }
    }

    public static void script1() {
        GameField field = new GameField(8, 8);

        field.addUnit(new SwordsmanFactory(), 0, 0);
        field.addUnit(new IroncladFactory(), 0, 7);
        field.addUnit(new CrossbowmanFactory(), 3, 3);
        field.addUnit(new ScoutFactory(), 6, 7);
        field.addUnit(new ChariotFactory(), 3, 4);
        field.addUnit(new HorsemanFactory(), 1, 5);

        GameFieldDraw.drawField(field);
    }

    public static void script2() {
        GameField field1 = new GameField(8, 8);
        GameField field2 = field1.copyGameField();

        field1.addUnit(new SwordsmanFactory(), 0, 0);
        field1.addUnit(new IroncladFactory(), 0, 7);

        field2.addUnit(new CrossbowmanFactory(), 3, 3);
        field2.addUnit(new ScoutFactory(), 6, 7);

        GameFieldDraw.drawField(field1);
        GameFieldDraw.drawField(field2);
    }

    public static void script3() {
        GameField field = new GameField(8, 8);

        field.addUnit(new SwordsmanFactory(), 0, 0);
        field.addUnit(new IroncladFactory(), 0, 7);
        field.addUnit(new CrossbowmanFactory(), 3, 3);
        field.addUnit(new ScoutFactory(), 6, 7);
        field.addUnit(new ChariotFactory(), 3, 4);
        field.addUnit(new HorsemanFactory(), 1, 5);

        GameFieldDraw.drawField(field);

        GameFieldIterator iterator = new GameFieldIterator(field);
        int i = 0;
        while (iterator.hasNext()) {
            if (i == 1) {
                field.removeUnit(3, 3);
            }
            System.out.println(iterator.next());
            i++;
        }
    }
}
