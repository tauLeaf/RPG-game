package tau.game.units.cavalry;

import tau.game.units.Unit;
import tau.game.units.UnitsType;

public class Horseman extends Cavalry {
    public Horseman(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack(Unit enemy) {
        System.out.println("Horseman is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Horseman is defending");
    }

    @Override
    public Unit clone() {
        return new Horseman(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.HORSEMAN;
    }
}
