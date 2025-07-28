public class JPiece implements Piece {
    private final int[][] states = {{2, 6, 9, 10}, {4, 5, 6, 10}, {1, 2, 5, 9}, {0, 4, 5, 6}};
    private int currentStateIndex;


    @Override
    public void rotate() {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public JPiece() {
        this.currentStateIndex = 0;
    }

    public int getStates() {
        return states.length;
    }

    public void setCurrentStateIndex(int currentStateIndex) {
        this.currentStateIndex = currentStateIndex;
    }

    @Override
    public char getType() {
        return 'J';
    }

    @Override
    public int[] getShape() {
        return states[currentStateIndex];
    }

    @Override
    public void reset() {
        setCurrentStateIndex(0);
    }
}

