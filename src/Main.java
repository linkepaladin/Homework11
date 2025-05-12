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
    }
}
