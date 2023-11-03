package arrays;

/**
 * @author Rakhim
 *
 * Напишите программу, которая умножает каждый элемент двумерной матрицы на заданное число.
 */

public class Task4 {
    public static void main(String [] args){
        int [][] matrix = {{3, 4, 2},
                           {6, 2, 8}};
       multiple(2, matrix);
    }

    static void multiple(int num, int arr [][]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.println(arr[i][j]*num);
            }
        }
    }
}
