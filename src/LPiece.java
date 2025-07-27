public class LPiece implements Piece {
    private final int[][] states = {{1, 5, 9, 10}, {2, 4, 5, 6}, {1, 2, 6, 10}, {4, 5, 6, 8}};
    private int currentStateIndex;


    @Override
    public void rotate() {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public LPiece() {
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
        return 'L';
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

