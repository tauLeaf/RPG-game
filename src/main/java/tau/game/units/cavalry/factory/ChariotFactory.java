package tau.game.units.cavalry.factory;

import tau.game.units.Unit;
import tau.game.units.cavalry.Chariot;

public class ChariotFactory extends CavalryFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Chariot(x, y);
    }
}
