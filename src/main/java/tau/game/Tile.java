package tau.game;

import tau.game.units.Unit;

public class Tile {
    private Unit unit;
    private TerrainType terrainType;

    public Tile(Unit unit) {
        this.unit = unit;
        this.terrainType = TerrainType.FLAT;
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
}

