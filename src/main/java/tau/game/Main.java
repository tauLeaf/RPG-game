package tau.game;

import tau.game.units.infantrymen.factory.IroncladFactory;
import tau.game.units.infantrymen.factory.SwordsmanFactory;

public class Main {
    public static void main(String[] args) {
        GameField field = new GameField(8, 8, 64);
        GameFieldDraw fieldDraw = new GameFieldDraw(field);

        field.addUnit(new SwordsmanFactory(), 2, 7);

        field.moveUnit(field.getUnit(0));
        field.moveUnit(field.getUnit(0));
        field.moveUnit(field.getUnit(0));
        field.moveUnit(field.getUnit(0));
        field.moveUnit(field.getUnit(0));
    }
}