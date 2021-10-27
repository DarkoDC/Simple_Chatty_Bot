import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        final int hundred = 100;
        final int ten = 10;

        int firstDigit = number % ten;
        int secondDigit = (number / ten) % ten;
        int thirdDigit = (number / hundred) % ten;

        System.out.println(firstDigit * hundred + secondDigit * ten + thirdDigit);
    }
}