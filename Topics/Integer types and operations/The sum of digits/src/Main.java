import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int third = number % 10;
        int second = (number / 10) % 10;
        int first = (number / 100) % 10;

        System.out.println(first + second + third);
    }
}