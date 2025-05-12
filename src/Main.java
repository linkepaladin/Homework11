import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задача 1");

        int[] ledger = {100, 500, 200, 50, 40};
        int sum = 0;
        for (int index: ledger) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2

        System.out.println("Задача 2");

        Arrays.sort(ledger);
        System.out.println("Минимальная сумма трат за неделю составила " + ledger[0] + " рублей ");
        System.out.println("Максимальная сумма трат за неделю составила " + ledger[ledger.length - 1] + " рублей ");
    }
}
