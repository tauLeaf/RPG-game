package tau.game.field;

import tau.game.field.terrain.TerrainType;
import tau.game.units.Unit;

public class Tile {
    private Unit unit;
    private TerrainType terrainType;

    public Tile(TerrainType terrainType) {
        this.unit = null;
        this.terrainType = terrainType;
    }

    public Tile(Unit unit, TerrainType terrainType) {
        this.unit = unit;
        this.terrainType = terrainType;
    }

    public Unit getUnit() {
        return unit;
    }

    public TerrainType getTerrainType() {
        return terrainType;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setTerrainType(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    public Tile clone() {
        return new Tile(unit.clone(), terrainType);
    }
}

