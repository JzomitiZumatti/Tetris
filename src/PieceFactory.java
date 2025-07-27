import java.util.Random;

public class PieceFactory {
    public static Piece create(char type) {
        return switch (type) {
            case 'I' -> new IPiece();
            case 'O' -> new OPiece();
            case 'T' -> new TPiece();
            case 'S' -> new SPiece();
            case 'Z' -> new ZPiece();
            case 'L' -> new LPiece();
            case 'J' -> new JPiece();
            default -> throw new IllegalArgumentException("Unknown piece: " + type);
        };
    }

    public static Piece createRandom() {
        char[] types = {'I', 'O', 'T', 'J', 'L', 'S', 'Z'};
        return create(types[new Random().nextInt(types.length)]);
    }
}
