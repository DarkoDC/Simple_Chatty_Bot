import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int max = scanner.nextInt();

        long result = 1;

        for (int i = min; i < max; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}