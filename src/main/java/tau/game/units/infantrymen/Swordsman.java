package tau.game.units.infantrymen;

import tau.game.attribute.*;
import tau.game.units.Unit;

import java.util.Random;

public class Swordsman extends Infantryman {
    public Swordsman(int x, int y) {
        super(x, y);

        attack = new Attack(25);
        armor = new Armor(3);
        health = new Health(100);
        move = new Move(Direction.UP, 2);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("SwordsmanEnemy have hp = " + enemy.getHealth().getAmount());

        double enemyDamageMultiplier = enemy.getArmor().getArmorMultiplier();
        int damage = (int) (attack.getAmount() * enemyDamageMultiplier);

        enemy.receiveDamage(damage);

        System.out.println("SwordsmanEnemy take " + damage + " and now its hp = " + enemy.getHealth().getAmount());
    }

    @Override
    public void defend() {
        armor.increaseArmor();
        System.out.println("Swordsman is defending: now its armor is " + armor.getAmount());
    }
}
