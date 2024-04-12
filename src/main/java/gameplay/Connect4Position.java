package gameplay;

public class Connect4Position extends Position{
    static int C=7,R=6;
    final static public int BLANK = 0;
    final static public int HUMAN = 1;
    final static public int PROGRAM = -1;
    int[][] board = new int[R][C];
}
