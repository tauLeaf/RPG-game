package tau.game.attribute;

public class Armor {
    private int amount;

    public Armor(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The value of the Armor is < 0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void decreaseArmor() {
        if (amount > 0) {
            amount -= 1;
        }
        else {
            System.out.println("Armor is broken");
        }
    }

    public void increaseArmor() {
        amount += 1;
    }

    public double getArmorMultiplier() {
        return amount * 0.08;
    }
}
