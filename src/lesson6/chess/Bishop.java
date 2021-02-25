package lesson6.chess;

public class Bishop extends Figure {

    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return isInDesk(x, y) &&
                Math.abs(getX() - x) == Math.abs(getY() - y);
    }
}
