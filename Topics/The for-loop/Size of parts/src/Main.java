import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int smallerCode = -1;
        final int largerCode = 1;
        Scanner scanner = new Scanner(System.in);

        int partsSize = scanner.nextInt();
        int rejected = 0;
        int readyToShip = 0;
        int toFix = 0;

        for (int i = 0; i < partsSize; i++) {
            int part = scanner.nextInt();
            if (part == smallerCode) {
                ++rejected;
            } else if (part == largerCode) {
                ++toFix;
            } else {
                ++readyToShip;
            }
        }
        System.out.printf("%d %d %d", readyToShip, toFix, rejected);
    }
}