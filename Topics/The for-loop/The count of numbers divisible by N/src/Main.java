import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int div = scanner.nextInt();
        int numberDivisible = 0;

        for (int i = min; i <= max; i++) {
            if (i % div == 0) {
                ++numberDivisible;
            }
        }
        System.out.println(numberDivisible);
    }
}