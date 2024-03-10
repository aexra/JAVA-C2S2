package Labs;

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
}
