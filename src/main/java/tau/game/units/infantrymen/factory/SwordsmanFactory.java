package tau.game.units.infantrymen.factory;

import tau.game.units.Unit;
import tau.game.units.infantrymen.Swordsman;

public class SwordsmanFactory extends InfantrymanFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Swordsman(x, y);
    }
}
