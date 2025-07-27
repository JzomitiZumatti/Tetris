public class OPiece implements Piece {
    private final int[][] states = {{5, 6, 9, 10}};
    private int currentStateIndex;


    @Override
    public void rotate() {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public OPiece() {
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
        return 'O';
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