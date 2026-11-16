package tau.game.units.ranged;

import tau.game.units.Attackable;
import tau.game.units.Unit;

public abstract class RangedUnit extends Unit implements Attackable {
    public RangedUnit(int x, int y) {
        super(x, y);
    }

    public abstract void attack(Unit unit);

    public abstract void defend();
}
