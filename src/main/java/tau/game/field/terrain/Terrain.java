package tau.game.field.terrain;

import tau.game.units.UnitsType;

public interface Terrain {
    boolean isPassable(UnitsType type);
    double getSpeedModifier(UnitsType type);
    double getDefenseBonus(UnitsType type);
}
