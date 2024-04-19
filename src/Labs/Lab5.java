package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Data5.Classes.*;

import java.util.ArrayList;
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

    @ILabTask(description = "coins")
    public void t8() {
        int sum = 11;
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);
        coins.add(7);
        print(change(sum, coins));
        change(sum, coins);
    }

    static void print(Pair<Integer, ArrayList<ArrayList<Integer>>> answer) {
        System.out.format("Минимальное число монет для выдачи сдачи: %d\n", answer.left);
        System.out.println("Оптимальные наборы монет:");
        for (int i = 0; i < answer.right.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < answer.right.get(i).size(); j++) {
                System.out.format("%d, ", answer.right.get(i).get(j));
            }
            System.out.println("]");
        }
    }

    static Pair<Integer, ArrayList<ArrayList<Integer>>> change(int sum, ArrayList<Integer> coins) {
        DList<Integer, ArrayList<Integer>> dList = new DList<>();

        ArrayList<ArrayList<Integer>> empty_array = new ArrayList<>();
        empty_array.add(new ArrayList<>());
        dList.add(0, empty_array);
        for (int i = 1; i <= sum; i++) {
            dList.add(sum + 1, new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < coins.size(); j++) {
                if (coins.get(j) <= i) {

                    if (dList.getAt(i).left < 1 + dList.getAt(i - coins.get(j)).left) {
                        continue;
                    } else if (dList.getAt(i).left > 1 + dList.getAt(i - coins.get(j)).left) {
                        int current_coins = 1 + dList.getAt(i - coins.get(j)).left;
                        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
                        for (int k = 0; k < dList.getAt(i - coins.get(j)).right.size(); k++) {
                            array.add(new ArrayList<>());
                            array.get(k).addAll(dList.getAt(i - coins.get(j)).right.get(k));
                        }
                        for (int k = 0; k < array.size(); k++) {
                            array.get(k).add(coins.get(j));
                        }
                        dList.setAt(new Pair<>(current_coins, array), i);
                    } else {
                        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
                        for (int k = 0; k < dList.getAt(i - coins.get(j)).right.size(); k++) {
                            array.add(new ArrayList<>());
                            array.get(k).addAll(dList.getAt(i - coins.get(j)).right.get(k));
                        }
                        for (int k = 0; k < array.size(); k++) {
                            array.get(k).add(coins.get(j));
                        }
                        array.addAll(dList.getAt(i).right);
                        dList.setAt(new Pair<>(dList.getAt(i).left, array), i);
                    }
                }
            }
        }

        return dList.getAt(sum);
    }
}
