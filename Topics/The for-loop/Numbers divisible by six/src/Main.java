import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = scanner.nextInt();

        final int six = 6;
        int sum = 0;

        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            if (number % six == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}