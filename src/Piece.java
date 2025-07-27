public interface Piece extends Rotable {
    char getType();

    int getStates();

    int[] getShape();

    void reset();
}


