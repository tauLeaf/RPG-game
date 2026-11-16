package tau.game.units.infantry.factory;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;
import tau.game.units.infantry.Swordsman;

public class SwordsmanFactory implements UnitFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Swordsman(x, y);
    }
}
