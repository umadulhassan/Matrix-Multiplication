
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matmul;

import java.util.*;
import java.util.Scanner;
import java.util.Random;
import matmul.MatrixMul;
import matmul.Strassen;
/**
 *
 * @author Umad Rai
 */
public class MatMul {
    /**
     * @param args the command line arguments
     */    
 
    public static void main(String[] args) {
        // TODO code application logic here
        //definin variables for rows and columns of both variables.
        MatrixMul mmul = new MatrixMul();
        long startTime = System.currentTimeMillis();
        mmul.matrixmultiplying();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        
        
        Strassen mmul2 = new Strassen();
        long startTime2 = System.currentTimeMillis();
        mmul.matrixmultiplying();
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println(elapsedTime);
        
        
    }
}
