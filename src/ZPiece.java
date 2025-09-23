public class ZPiece implements Piece {
    private final int[][] initialStates = {{4, 5, 15, 16}, {5, 15, 14, 24}};
    private int[] state = getActualState();
    private int[] actualState = {4, 5, 15, 16};
    private int previous = 1;
    private int front = 0;


    public void rotate(int col) {
        previous = front;
        front = (front + 1) % initialStates.length;
        int[] ac = new int[4];
        for (int i = 0; i < ac.length; i++) {
            ac[i] = initialStates[front][i] + getActualStateWithShifts()[i] + 10;
        }
        actualState = ac;
        setState(actualState);
    }

    public ZPiece() {
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

    private int[] getActualStateWithShifts() {
        int[] arr = new int[getActualState().length];
        for (int i = 0; i < getActualState().length; i++) {
            arr[i] = getActualState()[i] - initialStates[previous][i];
        }
        return arr;
    }
}