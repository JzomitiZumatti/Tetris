import java.util.Arrays;

public class Field {
    private final int rows;
    private final int cols;
    private final char[][] grid;

    public Field(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(grid[i], '-');
        }
    }

    public void place(Piece piece) {
        for (int index : piece.getShape()) {
            int pieceRow = index / cols;
            int pieceCol = index % cols;
            if (pieceRow < grid.length && pieceCol < grid[0].length) {
                grid[pieceRow][pieceCol] = '0';
            }
        }
    }

    public void move(Piece piece) {
        for (int index : piece.getState()) {
            int pieceRow = index / cols;
            int pieceCol = index % cols;
            if (pieceRow < grid.length && pieceCol < grid[0].length) {
                grid[pieceRow][pieceCol] = '0';
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
        for (int i = 0; i < rows; i++) {
            Arrays.fill(grid[i], '-');
        }
    }
}

