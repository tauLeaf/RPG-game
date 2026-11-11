package tau.game.units.infantrymen;

import tau.game.units.Attackable;
import tau.game.units.Unit;
import tau.game.units.infantrymen.factory.InfantrymanFactory;

public class Infantryman extends Unit implements Attackable {
    public Infantryman(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void attack(Unit enemy) {
        double enemyDamageMultiplier = enemy.getArmor().getArmorMultiplier();
        int damage = (int) (attack.getAmount() * enemyDamageMultiplier);

        enemy.receiveDamage(damage);
    }

    public void defend() {
        armor.increaseArmor();
    }

    @Override
    public void receiveDamage(int damage) {
        armor.decreaseArmor();
        health.decrease(damage);
    }
}
