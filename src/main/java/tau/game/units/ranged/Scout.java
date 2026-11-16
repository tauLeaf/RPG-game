package tau.game.units.ranged;

import tau.game.units.Unit;
import tau.game.units.UnitsType;
import tau.game.units.cavalry.Chariot;

public class Scout extends RangedUnit {
    public Scout(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack(Unit enemy) {
        System.out.println("Scout is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Scout is defending");
    }

    @Override
    public Unit clone() {
        return new Scout(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.SCOUT;
    }

    @Override
    public String toString() {
        return "This is Scout in (" + this.getX() + ", " + this.getY() + ")";
    }
}
