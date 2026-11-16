package tau.game.field.terrain;

import tau.game.units.UnitsType;

public class Hill implements Terrain {
    public boolean isPassable(UnitsType type) {
        return true;
    }

    public double getSpeedModifier(UnitsType type) {
        return 0.5;
    }

    public double getDefenseBonus(UnitsType type) {
        return 1.5;
    }
}
