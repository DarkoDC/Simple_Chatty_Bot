import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        final int maxStudentsPerDesk = 2;

        int desksForGroup1 = group1 / maxStudentsPerDesk + group1 % maxStudentsPerDesk;
        int desksForGroup2 = group2 / maxStudentsPerDesk + group2 % maxStudentsPerDesk;
        int desksForGroup3 = group3 / maxStudentsPerDesk + group3 % maxStudentsPerDesk;

        System.out.println(desksForGroup1 + desksForGroup2 + desksForGroup3);
    }
}