package tau.game.field;

import tau.game.field.terrain.Terrain;
import tau.game.units.Unit;

public class Tile {
    private Unit unit;
    private Terrain terrain;

    public Tile(Terrain terrain) {
        this.unit = null;
        this.terrain = terrain;
    }

    public Tile(Unit unit, Terrain terrain) {
        this.unit = unit;
        this.terrain = terrain;
    }

    public Unit getUnit() {
        return unit;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Tile clone() {
        if (unit == null) {
            return new Tile(null, terrain);
        }
        return new Tile(unit.clone(), terrain);
    }
}

