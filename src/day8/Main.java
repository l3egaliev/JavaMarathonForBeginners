package day8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       long before = System.currentTimeMillis();


        String nums = "";
        for(int i=0; i<=20000;i++){
           int num = i;
           nums += num+" ";
        }

        long after = System.currentTimeMillis();
        System.out.println("Time "+(after - before));
        System.out.println(nums);



        before = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<=20000;i++){
            stringBuilder.append(i).append(" ");
        }

        after = System.currentTimeMillis();
        System.out.println(stringBuilder);
        System.out.println("Time "+(after- before));

    }
}
