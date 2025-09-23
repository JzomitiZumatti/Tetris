public class JPiece implements Piece {
    private final int[][] states = {{2, 6, 9, 10}, {4, 5, 6, 10}, {1, 2, 5, 9}, {0, 4, 5, 6}};
    private int currentStateIndex;
    private int[] state = getCurrentState(states, currentStateIndex);

    @Override
    public void rotate(int col) {
        currentStateIndex = (currentStateIndex + 1) % states.length;
    }

    public JPiece() {
        this.currentStateIndex = 0;
    }


    public int[] getState() {
        return state;
    }

    public void setState(int[] state) {
        this.state = state;
    }

    @Override
    public int[] getShape() {
        return states[currentStateIndex];
    }

    private int[] getCurrentState(int[][] states, int currentState) {
        int[] result = new int[states[currentState].length];
        System.arraycopy(states[currentState], 0, result, 0, states[currentState].length);
        return result;
    }
}

