package Helpers;

public class Arrays {
    public static void DrawTableInt(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            System.out.print("[ ");
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + (col == array[row].length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }
    }
}
