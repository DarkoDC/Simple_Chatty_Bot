import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = scanner.nextInt();

        final int four = 4;
        int maxNumberDivisibleByFour = 0;

        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            if (number % four == 0 && number > maxNumberDivisibleByFour) {
                maxNumberDivisibleByFour = number;
            }
        }
        System.out.println(maxNumberDivisibleByFour);
    }
}