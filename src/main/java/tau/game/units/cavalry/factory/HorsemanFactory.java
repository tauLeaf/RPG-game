package tau.game.units.cavalry.factory;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;
import tau.game.units.cavalry.Horseman;

public class HorsemanFactory implements UnitFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Horseman(x, y);
    }
}
