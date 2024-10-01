public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        // task 2
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }

        // task 3
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Чётное число - " + i);
        }

        // task 4
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }

        // task 5
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // task 6
        System.out.println("Task 6");
        for (int i = 1; i <= 100; i = i + 7) {
            System.out.println("Каждое число больше предыдущего на 7 - " + i);
        }

        // task 7
        System.out.println("Task 7");
        for (int i = 2; i <= 520; i = i * 2) {
            System.out.println("Каждое число больше предыдущего в 2 раза - " + i);
        }

        // task 8
        System.out.println("Task 8");
        int hoard = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + hoard;
            System.out.println("Месяц " + i + " Итого " + total);
        }

        // task 9
        System.out.println("Task 9");
        int save = 29000;
        int savingsAmount = 0;
        for (int i = 1; i <= 12; i++) {
            savingsAmount = savingsAmount + savingsAmount / 100;
            savingsAmount = savingsAmount + save;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + savingsAmount);
        }

        // task 10
        System.out.println("Task 10");
        int number = 2;
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + "*" + j + "=" + number * j);
        }

    }
}
