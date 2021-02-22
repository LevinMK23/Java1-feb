package lesson5;

public class Semaphore {

    private enum State {
        GREEN, YELLOW, RED
    }

    private State state;
    private State prevState;

    public Semaphore() {
        state = State.GREEN;
        prevState = State.YELLOW;
    }

    public void next() {
        switch (state) {
            case GREEN:
                state = State.YELLOW;
                prevState = State.GREEN;
                break;
            case RED:
                state = State.YELLOW;
                prevState = State.RED;
                break;
            case YELLOW:
                if (prevState == State.GREEN) {
                    state = State.RED;
                } else {
                    state = State.GREEN;
                }
                prevState = State.YELLOW;
        }
    }

    public State getState() {
        return state;
    }
}
