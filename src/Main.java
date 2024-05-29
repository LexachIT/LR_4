import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }


        // Вывод отсортированного массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void combSort(int[] row) {
        double factor = 1.24;
        int step = row.length-1;
        while (step >= 1){
            for(int i = 0;i+step<row.length;++i){
                if(row[i]>row[i+step]){
                   swap (row,i,i+step);
                }
            }
            step /= factor;
        }

    }

    public static void swap(int[] row, int i, int j) {
        int swap = row[i];
        row[i] = row[j];
        row[j] = swap;
    }
}