package tau.game.units.cavalry;

public class Chariot extends Cavalry {
    public Chariot(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack() {
        System.out.println("Chariot is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Chariot is defending");
    }
}
