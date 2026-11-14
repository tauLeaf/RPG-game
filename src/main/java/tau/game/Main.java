package tau.game;

import tau.game.goals.SwordsmanGoals;
import tau.game.units.infantrymen.factory.SwordsmanFactory;
import tau.game.util.MathOperations;
import tau.game.util.Point;

public class Main {
    public static void main(String[] args) {
        GameField field = new GameField(8, 8);
        GameFieldDraw fieldDraw = new GameFieldDraw(field);

        field.addUnit(new SwordsmanFactory(), 0, 0);
//        field.addUnit(new SwordsmanFactory(), 0, 7);
//        field.addUnit(new SwordsmanFactory(), 3, 3);

        SwordsmanGoals test = new SwordsmanGoals(field);
        MathOperations.BFS(field, new Point(7, 7));
    }
}