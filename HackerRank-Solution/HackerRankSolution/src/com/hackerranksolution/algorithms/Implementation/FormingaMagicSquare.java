package com.hackerranksolution.algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Milind
 */
public class FormingaMagicSquare {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        int row[] = new int[3];
        int column[] = new int[3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
                row[s_i] += s[s_i][s_j];
                column[s_i] += s[s_j][s_i];
                
            }
        }
        
    //For Row
        int uniqueRowNumber = 0;
        int commonTotal = 0;
        int diffTotal = 0;
        if(row[0]==row[1]){
            uniqueRowNumber = 2;
            commonTotal = row[0];
            diffTotal = row[2];
        }else if(row[1] ==  row[2]){
            uniqueRowNumber = 0;
            commonTotal = row[1];
            diffTotal = row[0];
        }else{
            uniqueRowNumber = 1;
            commonTotal = row[2];
            diffTotal = row[1];
        }
        
        System.out.println(commonTotal - diffTotal);
 //For Column
/*        int uniqueColumnNumber = 0;
        if(column[0]==column[1]){
            uniqueColumnNumber = 2;
        }else if(column[1] ==  column[2]){
            uniqueColumnNumber = 0;
        }else{
            uniqueColumnNumber = 1;
        }*/
        //s[uniqueRowNumber][uniqueColumnNumber];
    
    }
    
}
