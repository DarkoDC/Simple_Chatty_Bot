import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int secondsInHour = 3_600;
        int secondsInMinute = 60;

        int timeInSeconds1 = hour1 * secondsInHour + minutes1 * secondsInMinute + seconds1;
        int timeInSeconds2 = hour2 * secondsInHour + minutes2 * secondsInMinute + seconds2;

        System.out.println(timeInSeconds2 - timeInSeconds1);
    }
}