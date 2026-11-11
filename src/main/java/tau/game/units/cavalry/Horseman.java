package tau.game.units.cavalry;

public class Horseman extends Cavalry {
    public Horseman(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack() {
        System.out.println("Horseman is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Horseman is defending");
    }
}
