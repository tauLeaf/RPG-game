package tau.game.units.ranged;

public class Crossbowman extends RangedUnit {
    public Crossbowman(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack() {
        System.out.println("Crossbowman is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Crossbowman is defending");
    }
}
