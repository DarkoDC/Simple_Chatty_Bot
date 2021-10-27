import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        final int min = 0;
        final int max = 1_000;

        for (int x = min; x <= max; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}