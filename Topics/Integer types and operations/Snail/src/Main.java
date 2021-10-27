import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerNight = scanner.nextInt();

        int days = (high - downPerNight) / (upPerDay - downPerNight);
        int reminders = (high - downPerNight) % (upPerDay - downPerNight);
        if (reminders > 0) {
            ++days;
        }
        System.out.println(days);

    }
}