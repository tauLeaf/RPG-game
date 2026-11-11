package tau.game.units.ranged.factory;

import tau.game.units.Unit;
import tau.game.units.ranged.Crossbowman;

public class CrossbowmanFactory extends RangedUnitFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Crossbowman(x, y);
    }
}
