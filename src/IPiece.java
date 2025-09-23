import java.util.Arrays;

public class IPiece implements Piece{
    private final int[][] initialStates = {{4, 14, 24, 34}, {3, 4, 5, 6}};
    private int[] state = getActualState();
    private final int[] actualState = {4, 14, 24, 34};
    private boolean pos = true;



    public void rotate(int col) {
        int[] temp = Arrays.copyOf(actualState, actualState.length);
        if (pos) {
            for (int i = 0; i < actualState.length; i++) {
                actualState[i] = temp[1] + i - 1;
            }
            pos = false;
        } else {
            for (int i = 0; i < actualState.length; i++) {
                actualState[i] = temp[1] + (col * (i + 1));
            }
            pos = true;
        }
        setState(actualState);
    }

    public IPiece() {
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

