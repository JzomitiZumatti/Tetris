public interface Piece extends Rotable {
    int[] getShape();
    int[] getState();
    void setState(int[] state);
}


