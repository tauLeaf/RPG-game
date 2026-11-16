package tau.game.util;

import tau.game.field.Tile;
import tau.game.field.GameField;
import tau.game.units.Unit;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GameFieldIterator implements Iterator<Unit> {
    private Tile[][] tiles;
    private int x;
    private int y;
    private int width;

    public GameFieldIterator(GameField field) {
        this.tiles = field.tiles;
        this.x = 0;
        this.y = field.getHeight() - 1;
        this.width = field.getWidth();
    }

    @Override
    public boolean hasNext() {
        for (; y >= 0; y--, x = 0) {
            for (; x < width; x++) {
                if (tiles[y][x].getUnit() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Unit next() {
        Unit tmp;
        if (hasNext()) {
            if (x == width - 1){
                tmp = tiles[y][x].getUnit();
                y--;
                x = 0;
                return tmp;
            }
            else {
                return tiles[y][x++].getUnit();
            }
        }
        else {
            throw new NoSuchElementException("GameFieldIterator doesn't have elements.");
        }
    }
}
