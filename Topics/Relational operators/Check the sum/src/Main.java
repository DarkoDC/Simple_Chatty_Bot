import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        final int twenty = 20;
        System.out.println(a + b == twenty || a + c == twenty || b + c == twenty);
    }
}