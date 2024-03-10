package Labs;

import static Helpers.Logger.log;
import static Helpers.Arrays.*;
import static Helpers.InputHelper.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Classes.MyUltraSuperCoolClassWithOneMethodForThisTask;
import Labs.Enums.IntersectionTypes;

public class Lab3 extends Lab {
    private Scanner scanner;

    public Lab3() {
        super();
        scanner = new Scanner(System.in);
    }

    @ILabTask(description = "Таблица значений sin(x) и e^x / x * lg(x) из интервала [pi/15..pi] с шагом pi/15")
    public void t1() {
        System.out.println("Таблица значений функций");
        System.out.printf("%-10s| %-15s| %-15s\n", "x", "sin(x)", "e^x / x * lg(x)");
        double val1, val2;
        for (double arg = Math.PI/15; arg < Math.PI; arg += Math.PI/15) {
            val1 = Math.sin(arg);
            val2 = Math.exp(arg) / arg * Math.log(arg);
            System.out.printf("%-10.5f| %-15.7f| %-15.7f\n", arg, val1, val2);
        }
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

    @ILabTask(description = "упорядочить по возрастанию элементы каждой строки матрицы 3x3. Вывести матрицу на экран до сортировки и после")
    public void t3() {
        Random rnd = new Random();
        int [][] array = new int[3][3];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array.length; c++) {
                array[r][c] = rnd.nextInt(20);
            }
        }
        System.out.printf("Неупорядоченный массив%n%s%n", Arrays.deepToString(array));
        // Сортировка пузырьком
        int temp;
        for (int r = 0; r < array.length; r++) {
            int n = array[r].length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[r][j] > array[r][j+1]) {
                        temp = array[r][j];
                        array[r][j] = array[r][j+1];
                        array[r][j+1] = temp;
                    }
                }
            }
        }
        System.out.printf("Упорядоченный массив%n%s", Arrays.deepToString(array));
    }

    @ILabTask(description = "ЫЫЫ")
    public void t4() {
        log("Результат проверки на пересечение: " + MyUltraSuperCoolClassWithOneMethodForThisTask.MyUltraCoolMethodForThisTask(
            inputInt("x1 = "),
            inputInt("y1 = "), 
            inputInt("r1 = "), 
            inputInt("x2 = "), 
            inputInt("y2 = "), 
            inputInt("r2 = ")
        ).desc);
    }

    @ILabTask(description = "Я скопировал 4е задание ЫЫЫ")
    public void t5() {
        t4();
    }
}
