import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            boolean isDividedByThree = i % 3 == 0;
            boolean isDividedByFive = i % 5 == 0;
            if (isDividedByThree || isDividedByFive) {
                if (isDividedByThree) {
                    System.out.print("Fizz");
                }
                if (isDividedByFive) {
                    System.out.print("Buzz");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }
    }
}