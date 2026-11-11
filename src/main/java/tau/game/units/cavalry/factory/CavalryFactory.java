package tau.game.units.cavalry.factory;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;
import tau.game.units.cavalry.Cavalry;

public class CavalryFactory implements UnitFactory {
    public Unit createUnit(int x, int y) {
        return new Cavalry(x, y);
    }
}
