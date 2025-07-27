import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        String input = scanner.nextLine().trim();
        Piece piece = PieceFactory.create(input.charAt(0));
        Field field = new Field();

        printField(field);
        printRotations(piece, field);

        if (piece.getStates() > 1) {
            piece.reset();
            printFieldWithPiece(field, piece);
        }
    }

    private void printRotations(Piece piece, Field field) {
        for (int i = 0; i < piece.getStates(); i++) {
            printFieldWithPiece(field, piece);
            piece.rotate();
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
}


