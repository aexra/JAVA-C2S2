package Labs;

import static Helpers.Logger.log;
import static Helpers.Arrays.*;

import java.util.Scanner;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;

public class Lab3 extends Lab {
    private Scanner scanner;

    public Lab3() {
        super();
        scanner = new Scanner(System.in);
    }

    @ILabTask(description = "Таблица значений sin(x) и e^x / x * lg(x) из интервала [pi/15..pi] с шагом pi/15")
    public void t1() {

    }

    @ILabTask(description = "Поиск наибольшего отрицательного элемента двумерного массива")
    public void t2() {
        int[][] ary = null;
        // ary = new int[][] { {-1, -15, 4, 8, 12}, {1, 2, -6, 7} };

        if (ary == null) {
            log("Введите число строк массива: ", "", false);
            int nrows = scanner.nextInt();
            
            ary = new int[nrows][];

            for (int row = 0; row < nrows; row++) {
                log("Введите число элементов для " + Integer.toString(row+1) + "-й строки: ", "", false);
                int ncols = scanner.nextInt();

                ary[row] = new int[ncols];

                for (int col = 0; col < ncols; col++) {
                    log("Введите " + Integer.toString(col+1) + "-й элемент строки: ", "", false);
                    int arg = scanner.nextInt();
                    ary[row][col] = arg;
                }
            }
        }

        DrawTableInt(ary);

        int maxNegative = -Integer.MAX_VALUE;
        if (ary.length < 1) {
            log("Невозможно обработать пустой массив.");
            return;
        }

        for (int row = 0; row < ary.length; row++) {
            for (int col = 0; col < ary[row].length; col++) {
                if (ary[row][col] < 0 && ary[row][col] > maxNegative) {
                    maxNegative = ary[row][col];
                }
            }
        }

        log("Максимальное отрицательное в заданном массиве: " + Integer.toString(maxNegative));
    }
}
