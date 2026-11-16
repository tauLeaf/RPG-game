package tau.game.units.cavalry;

import tau.game.units.Attackable;
import tau.game.units.Unit;

public abstract class Cavalry extends Unit implements Attackable {
    public Cavalry(int x, int y) {
        super(x, y);
    }

    public abstract void attack(Unit enemy);

    public abstract void defend();
}
