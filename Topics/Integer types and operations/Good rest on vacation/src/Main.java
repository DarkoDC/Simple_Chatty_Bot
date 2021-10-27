import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int nightHotelCost = scanner.nextInt();

        System.out.println(foodCostPerDay * days
                + 2 * oneWayFlightCost
                + nightHotelCost * (days - 1));
    }
}