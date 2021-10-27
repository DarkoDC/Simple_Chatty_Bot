import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        final int three = 3;
        int sum = 0;
        int numbersDivisibleByThree = 0;

        int firstNumberDivisibleByThree = min % three == 0 ?
                min : (min + 1) % three == 0 ?
                min + 1 : min + 2;

        for (int number = firstNumberDivisibleByThree; number <= max; number += three) {
            ++numbersDivisibleByThree;
            sum += number;
        }
        System.out.println((double) sum / numbersDivisibleByThree);
    }
}