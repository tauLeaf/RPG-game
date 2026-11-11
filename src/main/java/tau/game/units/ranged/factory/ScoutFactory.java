package tau.game.units.ranged.factory;

import tau.game.units.Unit;
import tau.game.units.ranged.Scout;

public class ScoutFactory extends RangedUnitFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Scout(x, y);
    }
}
