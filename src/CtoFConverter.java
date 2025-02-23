import java.util.Scanner;
public class CtoFConverter{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double celsius = 0;
    boolean validInput = false;


    while (!validInput) {
        System.out.print("Enter the temperature in Celsius: ");
        String input = scanner.nextLine();

        try {
            celsius = Double.parseDouble(input);
            validInput = true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numerical value.");
        }
    }

    double fahrenheit = (celsius * 9 / 5) + 32;


    System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F", fahrenheit);
}
}