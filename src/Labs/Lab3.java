package Labs;

import static Helpers.Logger.log;
import static Helpers.Arrays.*;
import static Helpers.InputHelper.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Classes.LeftRect;
import Labs.Classes.MyUltraSuperCoolClassWithOneMethodForThisTask;
import Labs.Classes.Regex;
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
        boolean found = false;
        if (ary.length < 1) {
            log("Невозможно обработать пустой массив.");
            return;
        }

        for (int row = 0; row < ary.length; row++) {
            for (int col = 0; col < ary[row].length; col++) {
                if (ary[row][col] < 0 && ary[row][col] > maxNegative) {
                    maxNegative = ary[row][col];
                    found = true;
                }
            }
        }

        log("Максимальное отрицательное в заданном массиве: " + (found ? Integer.toString(maxNegative) : "НЕ НАЙДЕНО"));
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

    @ILabTask(description = "Чё то там численное интегрирование чё то там табуляция")
    public void t6() {
        double MathCadSolve = 1.4682818284590449;
        double[][] steps = LeftRect.CreateSteps(0, 1, 101);
        double answer = LeftRect.Integrate(steps[0], steps[1]);
        System.out.println("Интеграл через метод левых прямоугольников: " + answer);
        System.out.println("Разница с Маткадом: +-" + Math.abs(answer - MathCadSolve));
    }

    @ILabTask
    public void t7() {
        int num = (int) inputInt("Введите число в 10СС: ");
        int base = (int) inputInt("Введите СС (2-8): ");
        System.out.printf("Мой метод - Число %d в %d-ичной СС: %d%n", num, base, ConvertTo(num, base));
        System.out.printf("Метод toString - Число %d в %d-ичной СС: %s%n ", num, base, Integer.toString(num, base));
    }

    @ILabTask
    public void t8() {
        int size = inputInt("Введите число коэффициентов");
        int alloc_size = (size > 1) ? size : size + 1;
        int[] coefs = new int[alloc_size];
        if (size == 1) coefs[1] = 0;
        for (int i = 0; i < size; i++) {
            coefs[i] = inputInt("Введите "  + (size - i - 1) + "-й коэф.: ");
        }
        // P = (a2 * x + a1) * x + a0
        int x = inputInt("Введите X: ");
        int poly = coefs[0] * x + coefs[1];
        String stdPoly = "P = " + "(".repeat(alloc_size - 1) + coefs[0] + "x + " + coefs[1] + ")";
        String valPoly = "P = " + "(".repeat(alloc_size - 1) + coefs[0] + " * " + x + " + " + coefs[1] + ")";
        for (int i = 2; i < size; i++) {
            poly = poly * x + coefs[i];
            stdPoly += "x + " + coefs[i] + ")";
            valPoly += " * " + x + " + " + coefs[i] + ")";
        }
        stdPoly += " = " + poly;
        valPoly += " = " + poly;
        System.out.println(stdPoly + "\n" + valPoly);
    }

    @ILabTask
    public void t9(String fmstr) {
        Regex ru = new Regex("Россия",
                "((\\+7)|8)(([- ]?[0-9]{3}[- ]?)|([(][0-9]{3}[)]))([0-9]{3}[- ]?)([0-9]{2}[- ]?)([0-9]{2})");
        Regex ro = new Regex("Ростов-на-Дону", "([2-3][- ]?)([0-9]{2}[- ]?)([0-9]{2}[- ]?)([0-9]{2})");
        Regex[] regs = {ru, ro};

        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        if (Boolean.parseBoolean(fmstr)) {
            for (Regex re : regs) {
                if (re.MatchLine(line)) System.out.println(re.GetLabel() + ": Корректный номер");
                else System.out.println(re.GetLabel() + ": Некорректный номер");
            }
        }
        else {
            for (Regex re : regs) {
                if (re.InLine(line)) System.out.println(re.GetLabel() + ": Содержится в строке");
                else System.out.println(re.GetLabel() + ": Не содержится в строке");
            }
        }
        scan.close();
    }

    @ILabTask
    public void t10() {
        Regex ru = new Regex("Россия",
                "((\\+7)|8)(([- ]?[0-9]{3}[- ]?)|([(][0-9]{3}[)]))([0-9]{3}[- ]?)([0-9]{2}[- ]?)([0-9]{2})");
        Regex ro = new Regex("Ростов-на-Дону", "([2-3][- ]?)([0-9]{2}[- ]?)([0-9]{2}[- ]?)([0-9]{2})");

        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        // String line = scan.nextLine();
        String line = "Мои номера 220-30-40 и 8904-378-16-61 не считая служебных";

        ArrayList<String> nums = new ArrayList<>();
        nums.addAll(ru.ExtractNums(line));
        nums.addAll(ro.ExtractNums(line));

        if(nums.size() == 0) System.out.println("В строке не найдено номеров");
        else System.out.println("Найденные номера: " + nums.toString());
        scan.close();
    }

    private static int ConvertTo(int dec, int base) {
        if (dec < 0) {
            System.out.println("Число должно быть больше или равно 0");
            return -1;
        }
        if(dec == 0) return 0;
        String result = "";
        while (dec > 0) {
            result = String.valueOf(dec % base) + result;
            dec /= base;
        }
        return Integer.valueOf(result);
    }
}
