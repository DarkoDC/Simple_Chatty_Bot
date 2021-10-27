import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine().replaceAll("\\s", "");
        String string2 = scanner.nextLine().replaceAll("\\s", "");

        System.out.println(string1.equals(string2));
    }
}