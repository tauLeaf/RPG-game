package tau.game;

import tau.game.field.GameField;
import tau.game.field.GameFieldDraw;
import tau.game.units.infantry.factory.SwordsmanFactory;
import tau.game.util.GameFieldIterator;
import tau.game.util.MathOperations;
import tau.game.util.Point;

public class Main {
    public static void main(String[] args) {
        GameField field = new GameField(8, 8);
        GameFieldDraw fieldDraw = new GameFieldDraw(field);

        field.addUnit(new SwordsmanFactory(), 0, 0);
        field.addUnit(new SwordsmanFactory(), 0, 7);
        field.addUnit(new SwordsmanFactory(), 3, 3);
        field.addUnit(new SwordsmanFactory(), 6, 7);
        field.addUnit(new SwordsmanFactory(), 3, 4);



        System.out.println("\n=================================================\n");

//        field.removeUnit(0);
//        field.removeUnit(0);
//        field.removeUnit(0);

        MathOperations.BFS(field, new Point(7, 7));

        System.out.println("\n\n");

        GameFieldIterator iterator = new GameFieldIterator(field);
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();
        iterator.hasNext();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}