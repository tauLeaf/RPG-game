package tau.game.units.infantry;

import tau.game.attribute.*;
import tau.game.units.Unit;
import tau.game.units.UnitsType;

public class Swordsman extends Infantry {
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

    @Override
    public Unit clone() {
        return new Swordsman(this.x, this.y);
    }

    @Override
    public UnitsType getType() {
        return UnitsType.SWORDSMAN;
    }

    @Override
    public String toString() {
        return "This is Swordsman in (" + this.getX() + ", " + this.getY() + ")";
    }
}
