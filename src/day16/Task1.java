/**
 * ����������� ���������, ������� �� ���� ��������� txt ���� � ������ �������
 * (����� ������������ ���� �� ������� 1 ��� 14) � � �������� ������ ������� �
 * ������� ������� �������������� ���� �����.
 * ����� ����� �������� ������������ ������. � ������� ���������� ������� ������
 * ������ ������������� ����� (�� ����� ������� ����� �������) � ����������� ������
 * (� 3 ������� ����� �������).
 */


package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double result = 0.0;
        while(scanner.hasNextLine()){
            String [] nums = scanner.nextLine().split(" ");
            double sum = 0.0;
            for (String s:nums){
                sum += Double.parseDouble(s);
            }
            result = sum / nums.length;
        }
        DecimalFormat df = new DecimalFormat(".###");
        System.out.println(result+"---->"+df.format(result));

    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        printResult(file);
    }
}
