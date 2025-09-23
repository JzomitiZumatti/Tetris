public class OPiece implements Piece {
    private final int[][] initialStates = {{4, 14, 15, 5}};
    private int[] state = getActualState();
    private final int[] actualState = {4, 14, 15, 5};


    public void rotate(int col) {
        for (int i = 0; i < actualState.length; i++) {
            actualState[i] = actualState[i] + 10;
        }
        setState(actualState);
    }

    public OPiece() {
        int currentStateIndex = 0;
    }

    @Override
    public int[] getShape() {
        return actualState;
    }

    public int[] getState() {
        return state;
    }

    public void setState(int[] state) {
        this.state = state;
    }

    public int[] getActualState() {
        return actualState;
    }
}