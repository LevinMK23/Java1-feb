package lesson6.chess;

public abstract class Figure {

    private static final int DESK_SIZE = 8;

    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // protected = package private + extends
    protected boolean isInDesk(int x, int y) {
        return x > 0 && y > 0 && x <= DESK_SIZE
                && y <= DESK_SIZE;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean canMoveTo(int x, int y);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
