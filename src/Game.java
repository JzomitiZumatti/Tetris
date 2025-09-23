import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        String input = scanner.nextLine();
        Piece piece = PieceFactory.create(input.charAt(0));
        int cols = scanner.nextInt();
        int rows = scanner.nextInt();
        scanner.nextLine();
        label:
        while (true) {
            Field field = new Field(rows, cols);
            switch (input) {
                case "exit":
                    break label;
                case "rotate":
                    piece.rotate(cols);
                    printFieldWithPiece(field, piece);
                    break;
                case "right": {
                    int[] pieceShape = piece.getShape();
                    for (int i = 0; i < pieceShape.length; i++) {
                        int pieceRow = pieceShape[i] / cols;
                        int pieceCol = pieceShape[i] % cols;
                        if (pieceRow + 1 < rows) {
                            pieceRow++;
                        }
                        pieceCol = (pieceCol + 1 + cols) % cols;
                        pieceShape[i] = pieceRow * cols + pieceCol;
                    }
                    piece.setState(pieceShape);
                    moveFieldWithPiece(field, piece);
                    break;
                }
                case "left": {
                    int[] s = piece.getShape();
                    for (int i = 0; i < s.length; i++) {
                        int pieceRow = s[i] / cols;
                        int pieceCol = s[i] % cols;
                        if (pieceRow + 1 < rows) {
                            pieceRow++;
                        }
                        pieceCol = (pieceCol - 1 + cols) % cols;
                        s[i] = pieceRow * cols + pieceCol;
                    }
                    piece.setState(s);
                    moveFieldWithPiece(field, piece);
                    break;
                }
                case "down": {
                    int[] s = piece.getShape();
                    for (int i = 0; i < s.length; i++) {
                        int pieceRow = s[i] / cols;
                        int pieceCol = s[i] % cols;
                        if (pieceRow + 1 < rows) {
                            pieceRow++;
                        }
                        s[i] = pieceRow * cols + pieceCol;
                    }
                    piece.setState(s);
                    moveFieldWithPiece(field, piece);
                    break;
                }
                default:
                    printField(field);
                    printFieldWithPiece(field, piece);
                    field.clear();
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private void printField(Field field) {
        field.clear();
        field.print();
        System.out.println();
    }

    private void printFieldWithPiece(Field field, Piece piece) {
        field.clear();
        field.place(piece);
        field.print();
        System.out.println();
    }

    private void moveFieldWithPiece(Field field, Piece piece) {
        field.clear();
        field.move(piece);
        field.print();
        System.out.println();
    }
}


