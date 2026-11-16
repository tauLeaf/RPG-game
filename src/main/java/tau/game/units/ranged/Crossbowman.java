package tau.game.units.ranged;

import tau.game.units.Unit;
import tau.game.units.UnitsType;
import tau.game.units.cavalry.Chariot;

public class Crossbowman extends RangedUnit {
    public Crossbowman(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack(Unit enemy) {
        System.out.println("Crossbowman is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Crossbowman is defending");
    }

    @Override
    public Unit clone() {
        return new Crossbowman(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.CROSSBOWMAN;
    }

    @Override
    public String toString() {
        return "This is Crossbowman in (" + this.getX() + ", " + this.getY() + ")";
    }
}
