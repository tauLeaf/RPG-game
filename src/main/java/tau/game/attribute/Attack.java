package tau.game.attribute;

public class Attack {
    private int amount;

    public Attack(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The value of the Attack is < 0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
