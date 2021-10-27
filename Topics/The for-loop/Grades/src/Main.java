import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < studentCount; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                ++gradeD;
            } else if (grade == 3) {
                ++gradeC;
            } else if (grade == 4) {
                ++gradeB;
            } else {
                ++gradeA;
            }
        }
        System.out.printf("%d %d %d %d", gradeD, gradeC, gradeB, gradeA);
    }
}