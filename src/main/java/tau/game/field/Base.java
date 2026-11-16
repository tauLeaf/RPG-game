package tau.game.field;

import tau.game.units.Unit;
import tau.game.units.UnitFactory;

import java.util.ArrayList;

public class Base {
    private int x;
    private int y;
    ArrayList<Unit> units;
    private int maxUnits;
    private int defenseLevel;
    private int resources;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
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

    public Unit createUnit(UnitFactory factory, int x, int y) {
        Unit unit = factory.createUnit(x, y);
        units.add(unit);
        return unit;
    }

    //TODO: Реакция на уничтожение юнита - при гибели юнита база получает уведомление (паттерн «Наблюдатель») и
    // может, например, уменьшить счётчик, освободить лимит.


}
