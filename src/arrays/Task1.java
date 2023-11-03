package arrays;

/**
 * @author Rakhim
 *
 * Напишите программу, которая вычисляет сумму всех элементов в одномерном массиве целых чисел.
 */

public final class Task1 {
    public static void main(String[] args) {
        int [] array = {2,2,3};
        System.out.println(sum2(array));
    }

    // Method 1 loop for each
    public static int sum1(int [] a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }

    // Method 2 loop for
    public static int sum2(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
