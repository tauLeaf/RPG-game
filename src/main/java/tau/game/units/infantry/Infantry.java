package tau.game.units.infantry;

import tau.game.units.Attackable;
import tau.game.units.Unit;

public abstract class Infantry extends Unit implements Attackable {
    public Infantry(int x, int y) {
        super(x, y);
    }

    public abstract void attack(Unit enemy);

    public abstract void defend();
}
