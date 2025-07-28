import java.util.Arrays;

public class Field {
    private final int rows = 4;
    private final int cols = 4;
    private final char[][] grid = new char[rows][cols];

    public Field() {
        for (int i = 0; i < 4; i++) {
            Arrays.fill(grid[i], '-');
        }
    }

    public void place(Piece piece) {
        for (int index : piece.getShape()) {
            int row = index / cols;
            int col = index % cols;
            if (row < grid.length && col < grid[0].length) {
                grid[row][col] = '0';
            }
        }
    }

    public void print() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void clear() {
        for (int i = 0; i < 4; i++) {
            Arrays.fill(grid[i], '-');
        }
    }
}

