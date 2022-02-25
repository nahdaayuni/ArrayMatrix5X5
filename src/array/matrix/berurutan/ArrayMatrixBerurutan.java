/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.matrix.berurutan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class ArrayMatrixBerurutan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrix[][] = new int [5][5];
        System.out.println("Masukkan nilai awal :");
        Scanner scan = new Scanner(System.in);
        int nilai = scan.nextInt();
        System.out.println("Matrix :");
        for(int a=0;a<5;a++){
            for(int b=0;b<5;b++){
            matrix[0][0] = nilai;
            matrix[a][b] = nilai++;
            System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
    }
    
}
}
