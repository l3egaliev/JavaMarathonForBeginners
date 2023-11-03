package arrays;

public class MultipleArray {
    public static void main(String[] args) {
        int [][] grades = {
                {89, 45, 87, 75},
                {85, 96, 43, 98},
                {84, 22, 45, 56}
        };

        int maxGrade = grades[0][0];
        int row = 0;
        int col = 0;
        // Обход строк массива
        for(int i = 0; i < grades.length; i++){
            // Обход столбцов массива
            for(int j = 0; j < grades[i].length; j++){
                if (grades[i][j]>maxGrade){
                    maxGrade = grades[i][j];
                    row = i;
                    col = j;
                }
            }

        }
        System.out.println("Максимальная оценка: "+maxGrade);
        System.out.println("Индекс строки: "+row);
        System.out.println("Индекс столбца: "+col);
    }
}
