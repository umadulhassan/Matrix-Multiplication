/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matmul;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Umad Rai
 */
public class MatrixMul {
    public static  int rows, cols, srows, scols;
    public static int firstMat[][];
    public static int secondMat[][];
    public static int resultMat[][];
    public static int rand;
    
    public static void MatrixMul(){} 
     //Taking input for rows and columns of first matrix.
    public static void matrixmultiplying(){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of first matrix");
      rows = in.nextInt();
      cols = in.nextInt();
      
      //Taking input for rows and columns of second matrix.
      System.out.println("Enter the number of rows and columns of second matrix");
      srows = in.nextInt();
      scols = in.nextInt();
      Random rand = new Random();
      //Initializing matrices.
      int firstMat[][] = new int[rows][cols];
      int secondMat[][] = new int[srows][scols];
      int resultMat[][] = new int[rows][scols];
      
      //Assigning values randomly to first matrix.
      for (int i = 0; i < rows; i++){
          for(int j =0 ;j<cols;j++){
             firstMat[i][j] = rand.nextInt((10 - 0) +1) + 0;
          }        
    }
      //Assigning values randomly to second matrix.  
      for (int i = 0; i < rows; i++){
          for(int j =0 ;j<cols;j++){
             secondMat[i][j] = rand.nextInt((10 - 0) +1) + 0;
          }        
    }
      //Printing first matrix.
      for (int i = 0; i < rows; i++){
          for(int j =0 ;j<cols;j++){
          System.out.print(firstMat[i][j] + "\t");
          }
          System.out.print("\n");
          }
      //Printing second matrix.
      for (int i = 0; i < rows; i++){
          for(int j =0 ;j<cols;j++){
          System.out.print(secondMat[i][j] + "\t");
          }
          System.out.print("\n");
      }
      //Multiplying first and second matrix and saving it in result matrix.
      for (int i = 0; i < rows; i++){
          for(int j =0 ; j < cols; j++){
              resultMat[i][j] = 0;
              for(int k = 0; k < rows; k++){
                 resultMat[i][j] += firstMat[i][k] * secondMat[k][j];
          }
         }
        }
      //Printing Result Matrix.
      for (int i = 0; i < rows;i++){
          for (int j = 0; j < scols; j++){
          System.out.print(resultMat[i][j] + "\t");
          }
          System.out.print("\n");
      }
    
    }
}
