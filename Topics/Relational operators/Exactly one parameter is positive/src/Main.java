import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        final int zero = 0;
        boolean firstPositive = number1 > zero;
        boolean secondPositive = number2 > zero;
        boolean thirdPositive = number3 > zero;

        boolean isOnlyOnePositive = (firstPositive && !secondPositive && !thirdPositive) ||
                (!firstPositive && secondPositive && !thirdPositive) ||
                (!firstPositive && !secondPositive && thirdPositive);

        System.out.println(isOnlyOnePositive);
    }
}