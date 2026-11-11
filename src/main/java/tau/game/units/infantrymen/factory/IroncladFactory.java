package tau.game.units.infantrymen.factory;

import tau.game.units.Unit;
import tau.game.units.infantrymen.Ironclad;

public class IroncladFactory extends InfantrymanFactory {
    @Override
    public Unit createUnit(int x, int y) {
        return new Ironclad(x, y);
    }
}
