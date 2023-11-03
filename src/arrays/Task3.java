package arrays;

/**
 * @author Rakhim
 *
 *
 *  Создайте программу, которая находит минимальное и максимальное значения в одномерном массиве.
 */


public class Task3 {
    public static void main(String[] args) {
        int arr [] = {4, 1, 65, 222};
        maxAndMin(arr);
    }

    static void maxAndMin(int [] arr){
        int max = arr[0];
        int min = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min && arr[i] < max){
                min = arr[i];
            }
            if (arr[i] > min && arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);

    }
}
