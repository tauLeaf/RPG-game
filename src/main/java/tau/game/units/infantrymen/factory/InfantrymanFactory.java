package tau.game.units.infantrymen.factory;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;
import tau.game.units.infantrymen.Infantryman;

public class InfantrymanFactory implements UnitFactory {
    public Unit createUnit(int x, int y) {
        return new Infantryman(x, y);
    }
}
