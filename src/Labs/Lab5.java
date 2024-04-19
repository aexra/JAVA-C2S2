package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Data5.Classes.*;

import java.util.Scanner;

import static Helpers.Logger.*;

public class Lab5 extends Lab {
    @ILabTask(description = "bag test")
    public void t1() {
        var bag = new Bag(10);
        bag.push(1);
        bag.push(2);
        bag.push(3);
        bag.push(4);
        log(bag);
        log(bag.pop());
        log(bag);
    }

    @ILabTask(description = "pairbag test")
    public void t2() {
        var pb = new PairBag(10);
        pb.push(new Pair<Integer, String>(2, "two"));
        log(pb);
    }

    @ILabTask(description = "turnir")
    public void t6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество команд (четное)");
        int n = inputPosInt(scan);
        if (n % 2 != 0) {
            System.out.println("Вы ввели некорректное количество команд, поэтому их будет 8");
            n = 8;
        }

        Bag bag1 = new Bag(n);
        for (int i = 0; i < n; i++) {
            bag1.push("Team" + (i + 1));
        }
        GenericPairBag<String, String> bag2 = new GenericPairBag<>(n / 2);

        while (bag1.size() > 1) {

            while (bag1.size() > 0) {
                String t1 = (String)  bag1.pop();
                String t2 =  (String) bag1.pop();
                bag2.push(new Pair<String, String>(t1, t2));
            }

            System.out.println("Выберите команду-победителя из двух предложенных:");
            while (bag2.size() > 0) {
                Pair<String, String> teams = (Pair<String, String>) bag2.pop();
                System.out.format("1. %s 2. %s\n", teams.left, teams.right);
                int selectedTeam = 0;
                while (selectedTeam != 1 && selectedTeam != 2) {
                    selectedTeam = inputPosInt(scan);
                }
                String team = new String();
                if (selectedTeam == 1) {
                    team = teams.left;
                } else if (selectedTeam == 2) {
                    team = teams.right;
                }

                bag1.push(team);
            }
        }

        System.out.format("Команда-победитель: %s", (String) bag1.pop());
    }

    public static int inputPosInt(Scanner scan) {
        int m = 0;
        while (true) {
            if (scan.hasNextInt()) {
                m = scan.nextInt();
                if (m > 0)
                    return m;
                else
                    System.out.println("Ошибка! Длина должна быть больше 0!");
            } else
                System.out.println("Ошибка! Длина должна быть целым числом!");
        }
    }
}
