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
        if (amount < 0) {
            throw new IllegalArgumentException("The value of the increase amount is < 0");
        }
        this.amount += amount;
    }

    public void decrease(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The value of the decrease amount is < 0");
        }
        if (amount > this.amount) {
            this.amount = 0;
            System.out.println("Over damage");
            return;
        }
        this.amount -= amount;
    }

    public boolean isZero() { return amount == 0; }
}
