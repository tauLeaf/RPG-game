package tau.game.units.ranged;

public class Scout extends RangedUnit {
    public Scout(int x, int y) {
        super(x, y);
    }
    @Override
    public void attack() {
        System.out.println("Scout is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Scout is defending");
    }
}
