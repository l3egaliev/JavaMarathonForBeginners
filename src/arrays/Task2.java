package arrays;

/**
 * @author Rakhim
 *
 * Разработайте программу, которая находит среднее значение (среднюю арифметическую) элементов в массиве.
 */


public class Task2 {
    public static void main(String [] args){
            int array [] = {3,4,5,2};
        System.out.println(whileArithmetic(array));
    }

    // With for each loop
    public static double arithmetic(int arr []){
        double sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum/arr.length;
    }

    // with wile loop
    static double whileArithmetic(int arr []){
        double sum = 0;
        int counter = 0;
        while(counter<arr.length){
            sum += arr[counter];
            counter ++;
        }
        return sum / arr.length;
    }


}
