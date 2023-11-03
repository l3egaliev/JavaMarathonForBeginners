package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count5(535245));
    }

    public static int count5(int n){
        if(n == 0)
            return 0;

        if(n % 10 == 5){
            return 1 + count5(n / 10);
        }else
            return count5(n / 10);
    }
}
