package tau.game.attribute;

public class Move {
    private Direction direction;
    private int speed;

    public Move(Direction direction, int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("The value of the speed is < 0");
        }
        this.direction = direction;
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }

}
