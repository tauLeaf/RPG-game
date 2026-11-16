package tau.game.field.terrain;

import tau.game.units.UnitsType;

public class Mountains implements Terrain {
    public boolean isPassable(UnitsType type) {
        return type == UnitsType.SCOUT;
    }

    public double getSpeedModifier(UnitsType type) {
        return 0.2;
    }

    public double getDefenseBonus(UnitsType type) {
        return 1.8;
    }
}
