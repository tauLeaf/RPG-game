package tau.game.units.cavalry;

import tau.game.units.Unit;
import tau.game.units.UnitsType;

public class Chariot extends Cavalry {
    public Chariot(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack(Unit enemy) {
        System.out.println("Chariot is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Chariot is defending");
    }

    @Override
    public Unit clone() {
        return new Chariot(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.CHARIOT;
    }
}
