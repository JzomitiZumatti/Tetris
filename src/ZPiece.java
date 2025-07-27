public class ZPiece implements Piece {
    private final int[][] states = {{4, 5, 9, 10}, {2, 5, 6, 9}, {4, 5, 9, 10}, {2, 5, 6, 9}};
    private int currentStateIndex;


    @Override
    public void rotate() {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public ZPiece() {
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
        return 'Z';
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

