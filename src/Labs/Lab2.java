package Labs;

import static Helpers.Logger.*;

import Core.LabManagement.Lab;

public class Lab2 extends Lab {
    public void t1() {
        log("Минимальные и максимальные значения численных типов:\n");
        log("Тип\t\tМинимальное значение\tМаксимальное значение");
        log("byte\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        log("short\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        log("int\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        log("long\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        log("float\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        log("double\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
    }
    public void t2() {
        int[] a = new int[]{0, 1, -2, 3, 4, 5, 6, 7, -8, 9, 10, 11, -12, 13, 14, -15, 16, 17, -18, 19};
        int sum = 0;
        int count = 0;
        for (int e : a) {
            if (e < 0) {
                sum += e;
                count++;
            }
        }
        log("Среднее геометрическое: " + Integer.toString(sum / count));
    }
    public void t3() {
        int R = 500;
        int r = 50;

        int targetX = 5;
        int targetY = 5;
        double targetDistance = Math.sqrt(targetX*targetX + targetY*targetY);

        if (targetDistance > R) log("Объект не обнаружен");
        else if (targetDistance < r) log("Тревога");
        else log("Объект обнаружен");
    }
    public void t4(String s_R, String s_r, String s_targetX, String s_targetY) {
        int R = Integer.parseInt(s_R);
        int r = Integer.parseInt(s_r);

        int targetX = Integer.parseInt(s_targetX);
        int targetY = Integer.parseInt(s_targetY);
        double targetDistance = Math.sqrt(targetX*targetX + targetY*targetY);

        if (targetDistance > R) log("Объект не обнаружен");
        else if (targetDistance < r) log("Тревога");
        else log("Объект обнаружен");
    }
    public void t5(String number) {
        log("10-я:\t" + number);
        log("2-я:\t" + Integer.toString(Integer.parseInt(number), 2));
        log("8-я:\t" + Integer.toString(Integer.parseInt(number), 8));
        log("16-я:\t" + Integer.toString(Integer.parseInt(number), 16));
    }
    public void t6() {
        drawSymbolicTable(0x0400, 16, 16);
        log("", "");
        log("", "");
        drawSymbolicTable(0x20a0, 2, 16);
    } 
    public void t7() {
        String s = "sTRingXLt18VI_a";
        String arabic = "IVXLCDM";
        
        log("Строка: " + s);
        log("Буквы: " + s.chars().filter(Character::isAlphabetic).count());
        log("Строчных: " + s.chars().filter(Character::isUpperCase).count());
        log("Прописных: " + s.chars().filter(Character::isLowerCase).count());
        log("Цифр: " + (s.chars().filter(Character::isDigit).count() + s.chars().filter(ch -> arabic.indexOf(ch) != -1).count()));
        log("Арабских: " + s.chars().filter(Character::isDigit).count());
        log("Не арабских: " + s.chars().filter(ch -> arabic.indexOf(ch) != -1).count());
        log("Другие символы: " + (s.length() - s.chars().filter(Character::isAlphabetic).count() - s.chars().filter(Character::isDigit).count()));
        log("Символов: " + s.length());
    }
    public void t8() {
        log("Всё посмотрел, всё понял!");
    }
    public void t9() {
        String s1 = "aaa";
        String s2 = "a";

        int count = 0;
        int lastIndex = -1;
        int lastD = 0;

        while (true) {
            try {
                if ((lastD = (s1.substring(lastIndex += 1)).indexOf(s2)) != -1) {
                    count++;
                    lastIndex += lastD;
                } else {
                    break;
                }
            }
            catch (Exception ex) {
                break;
            }
        }

        log("Число вхождений: " + count);
    }
    public void t10(String s) {
        log("Все циклические перестановки строки <" + s + ">");

        log("1. " + s);

        for (int i = 0; i < s.length() - 1; i++) {
            char tmp = s.charAt(0);
            s = s.substring(1) + tmp;

            log(String.valueOf(i+2) + ". " + s);
        }
    }

    private void drawSymbolicTable(int start, int rows, int cols) {
        final String marks = "abcdefghijklmnopqrstuvwxyz";

        String title = "";
        for (int i = 0; i < cols; i++) {
            if (i > 9) {
                title += marks.charAt(i - 10);
            } else {
                title += Integer.toString(i);
            }
        }
        log("\t" + title, "", false);

        System.out.println();

        int code = start;
        for (int i = 0; i < rows; i++) {
            log(Integer.toString(i) + "\t", "", false);
            for (int j = 0; j < cols; j++) {
                log((char)code, "", false);
                code++;
            }
            System.out.println();
        }
    }
}
