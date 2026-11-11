package tau.game.units.ranged.factory;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;
import tau.game.units.infantrymen.Infantryman;
import tau.game.units.ranged.RangedUnit;

public class RangedUnitFactory implements UnitFactory {
    public Unit createUnit(int x, int y) {
        return new RangedUnit(x, y);
    }
}
