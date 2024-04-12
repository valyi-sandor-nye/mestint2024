package gameplay;

import static gameplay.Connect4Position.C;
import static gameplay.Connect4Position.R;

public class Connect4 extends GameSearch {
    @Override
    public boolean drawnPosition(Position p) {
        return false;
    }

    @Override
    public boolean wonPosition(Position p, boolean player) {
        int sign = player?1:-1;
        boolean answer = false;
        Connect4Position pos = (Connect4Position)p;
        for (int row=0;row<R;row++) for(int col=0;col<C-4;col++)
            if (pos.board[row][col]==sign && pos.board[row][col+1]==sign
                    && pos.board[row][col+2]==sign &&pos.board[row][col+3]==sign ) answer = true;
        for (int col=0;col<C;col++) for(int row=0;row<R-4;row++)
            if (pos.board[row][col]==sign && pos.board[row+1][col]==sign
                    && pos.board[row+2][col]==sign &&pos.board[row+3][col]==sign ) answer = true;
        for (int row=0;row<R-4;row++) for(int col=0;col<C-4;col++)
            if (pos.board[row][col]==sign && pos.board[row+1][col+1]==sign
                    && pos.board[row+2][col+2]==sign &&pos.board[row+3][col+3]==sign ) answer = true;
        for (int row=0;row<R-4;row++) for(int col=3;col<C;col++)
            if (pos.board[row][col]==sign && pos.board[row+1][col-1]==sign
                    && pos.board[row+2][col-2]==sign &&pos.board[row+3][col-3]==sign ) answer = true;

            return answer;
    }

    @Override
    public double positionEvaluation(Position p, boolean player) {
        return 0;
    }

    @Override
    public void printPosition(Position p) {

    }

    @Override
    public Position[] possibleMoves(Position p, boolean player) {
        return new Position[0];
    }

    @Override
    public Position makeMove(Position p, boolean player, Move move) {
        return null;
    }

    @Override
    public boolean reachedMaxDepth(Position p, int depth) {
        return false;
    }

    @Override
    public Move createMove() {
        return null;
    }
}
