/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzleN.tool;

/**
 *
 * @author valyis
 */
public class Matrix {
    /* The method returns true iff the input int-matrix has equal length rows and columns. */
    static public boolean hasEqualLengthRows (int[][] matrix) {
        int l = matrix.length;
        boolean lengths_are_ok = true; 
           for (int y=0; y<l; y++) {
               if (matrix[y].length != l) lengths_are_ok = false;
           }
        return lengths_are_ok;
    }    
}
