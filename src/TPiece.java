public class TPiece implements Piece {
    private final int[][] states = {{1, 4, 5, 6}, {1, 4, 5, 9}, {4, 5, 6, 9}, {1, 5, 6, 9}};
    private int currentStateIndex;


    @Override
    public void rotate() {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public TPiece() {
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
        return 'T';
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
