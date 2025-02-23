import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double pricePerGallon = 0;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallons = scanner.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            efficiency = scanner.nextDouble();
        } while (efficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        double costToDrive100Miles = (100 / efficiency) * pricePerGallon;
        double distanceWithFullTank = gallons * efficiency;

        System.out.printf("Cost to drive 100 miles: $%.2f%n ", costToDrive100Miles);
        System.out.printf("Distance the car can go with a full tank: %.2f miles%n ", distanceWithFullTank);

        scanner.close();
    }
}
