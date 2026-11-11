package tau.game.attribute;

public class Health {
    private int amount;

    public Health(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The value of the Health is < 0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void increase(int amount) {
        this.amount += amount;
    }

    public void decrease(int amount) {
        if (this.amount < amount) {
            this.amount = 0;
        }
        this.amount -= amount;
    }

    public boolean isZero() { return amount == 0; }
}
