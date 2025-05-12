import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задача 1");

        int[] ledger = {100, 500, 200, 50, 40};
        int sum = 0;
        for (int index : ledger) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // task 2

        System.out.println("Задача 2");

        int max = ledger[0];
        int min = ledger[0];
        for (int j : ledger) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        // task 3

        System.out.println("Задача 3");

        double avgExpense = (double) sum / ledger.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgExpense + " рублей");

        // task 4

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char charToSwap = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = charToSwap;

        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
