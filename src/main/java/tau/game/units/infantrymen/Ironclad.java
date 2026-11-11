package tau.game.units.infantrymen;

import tau.game.units.Attackable;
import tau.game.units.Unit;
import tau.game.units.infantrymen.factory.IroncladFactory;

public class Ironclad extends Infantryman {
    public Ironclad(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("Ironclad is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Ironclad is defending");
    }
}
