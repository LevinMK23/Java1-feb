package lesson6.chess;

public class Rook extends Figure {

    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return isInDesk(x, y) &&
                (getX() - x == 0 || getY() - y == 0);
    }
}
