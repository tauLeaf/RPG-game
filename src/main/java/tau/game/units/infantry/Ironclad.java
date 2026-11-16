package tau.game.units.infantry;

import tau.game.units.Unit;
import tau.game.units.UnitsType;

public class Ironclad extends Infantry {
    public Ironclad(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Ironclad is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Ironclad is defending");
    }

    @Override
    public Unit clone() {
        return new Ironclad(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.IRONCLAD;
    }

    @Override
    public String toString() {
        return "This is Ironclad in (" + this.getX() + ", " + this.getY() + ")";
    }
}
