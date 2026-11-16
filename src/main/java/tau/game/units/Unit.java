package tau.game.units;

import tau.game.attribute.*;

public abstract class Unit {
    protected Health health;
    protected Armor armor;
    protected Attack attack;
    protected Move move;

    protected int x;
    protected int y;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Health getHealth() {
        return health;
    }

    public Armor getArmor() {
        return armor;
    }

    public Attack getAttack() {
        return attack;
    }

    public Move getMove() {
        return move;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void receiveDamage(int damage) {
        health.decrease(damage);
    }

    public abstract Unit clone();

    public abstract UnitsType getType();
}
