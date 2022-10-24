public class Main {
    public static void main(String[] args) {
System.out.println("Задача 1.\n");
        double sum = 0;
        for (int j : arr) {
        sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %.0f рублей.\n", sum);

        System.out.println("\nЗадача 2.\n");
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", arr[0]);
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", arr[arr.length - 1]);
        System.out.println("\nЗадача 3.\n");
        double average = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);

        System.out.println("\nЗадача 4.\n");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c]);
        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
