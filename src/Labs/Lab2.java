package Labs;

import static Helpers.Logger.*;

import Core.LabCore.Lab;

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
        drawSymbolicTable(0x20a0, 2, 16);
    }


    private void drawSymbolicTable(int start, int rows, int cols) {
        log((char)start);
    }
}
