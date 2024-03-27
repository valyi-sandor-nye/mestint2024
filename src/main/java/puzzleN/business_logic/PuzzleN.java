package puzzleN.business_logic;
import puzzleN.tool.Matrix;

import java.util.List;
import java.util.ArrayList;

/**
 * @author valyis
 */
public class PuzzleN {
    /** the static data member N describes the size of the table */
    private static int N;
    /** the edited table*/
    private int[][] table;
    private int nullX, nullY;
    public PuzzleN(){
        this(3);
    }
    /** The constructor gets an iteger, as the size of the quadratic table
     * @param size */
    public PuzzleN(int size) {
        N = size;
        nullX = nullY = 0;
        table = new int[N][N];
           for (int y=0; y<N; y++) {
               for (int x=0; x<N; x++) {
                   table[y][x] = y*N+x;
                   }
               }

    }
    /** The constructor gets an input matrix of integers and sets it as the table, if the input matrix is a quadratic one.
     If not, it does nothing
     * @param inputIntMatrix.*/
    public PuzzleN(int[][] inputIntMatrix) {
        if (Matrix.hasEqualLengthRows(inputIntMatrix)) {
           N = inputIntMatrix.length;
           table = new int[N][N];
           for (int y=0; y<N; y++) {
               for (int x=0; x<N; x++) {
                   table[y][x] = inputIntMatrix[y][x];
               }
           }
           for (int y=0; y<N; y++) {
               for (int x=0; x<N; x++) {
                   if (table[y][x] == 0) {
                        nullX = x;
                        nullY = y; 
                   }
               }
           }
           
        }
    }

    /** It decides if a step into the parameter direction is allowed to the table
     * @param direction is a Direction
     * @return  the truth value of the condition ˘is the step into that direction is allowed for the table?*/
    public boolean stepIsAllowed(Direction direction) {
        switch (direction) {
            case NORTH: 
                return nullY > 0; 
            case EAST:
                return  nullX < N-1;
            case SOUTH:
                return nullY < N-1;
            case WEST:
                return nullX > 0;
            default: return false;    
            }
    }
    /** It makes the input direction on the table and sets the values of nullX, nullY.
     * @param direction is a Direction. */
    public void doStep(Direction direction) {
        if (stepIsAllowed(direction)) {
            switch (direction) {
                case NORTH: 
                    table[nullY][nullX] = table[nullY-1][nullX];
                    table[nullY-1][nullX] = 0;
                    nullY--;
                    break;
                case EAST: 
                    table[nullY][nullX] = table[nullY][nullX+1];
                    table[nullY][nullX+1] = 0;
                    nullX++;
                    break;
                case SOUTH: 
                    table[nullY][nullX] = table[nullY+1][nullX];
                    table[nullY+1][nullX] = 0;
                    nullY++;
                    break;
                case WEST: 
                    table[nullY][nullX] = table[nullY][nullX-1];
                    table[nullY][nullX-1] = 0;
                    nullX--;
                    break;
            }
        }
    }
    /** It answers whether the actual table is a solution for the problem.
     * @return  */
    public boolean isSolution() {
        boolean answer = true;
           for (int y=0; y<N; y++) {
               for (int x=0; x<N; x++) {
                   if (table[y][x] != y*N+x) answer = false;
               }
           }    
        return answer;
    }
    public int get(int y,int x) {
        return table[y][x];
    }
    @Override public  String toString() {
       StringBuilder sb = new StringBuilder("[\n");
       for (int y=0; y<N; y++) {
               for (int x=0; x<N; x++) {
                   sb.append(table[y][x]);
                   sb.append("\t");
               }
               sb.append("\n");
       }
       sb.append("]");          
       return sb.toString();
    }
    
    public boolean isSolvable() {
        int numberOfInversions = 0;
        for (int k=0; k<N; k++) for (int m=0; m<N;m++) 
            for (int k2=k; k2<N; k2++) for (int m2=0; m2<N;m2++) 
            if (((k2>k) || (k2==k) && (m2>m)) && table[k2][m2]<table[k][m]) 
                numberOfInversions++;
        if (numberOfInversions%2==1) return false;
        else return true;

    }
    
    public static PuzzleN getRandomPuzzle(int size) {
        PuzzleN candidatePuzzle = null;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<size*size; i++) 
            list.add(i);
        boolean solvable = false;
        while (!solvable) {
            java.util.Collections.shuffle(list);
            int[][] newTable = new int[size][size];
           for (int y=0; y<size; y++) {
                   for (int x=0; x<size; x++) {
                        newTable[y][x] = list.get(y*size+x);
                   }
            
           }
           candidatePuzzle = new PuzzleN(newTable);
           solvable = candidatePuzzle.isSolvable();
        }
        return  candidatePuzzle;
    }

    public void printToTextFile(String mentéstxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void readFromTextFile(String mentéstxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
