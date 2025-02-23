import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;

        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) break;
            }
            scanner.nextLine();
            System.out.println("Please enter a valid positive number for width.");
        }

        while (true) {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) break;
            }
            scanner.nextLine();
            System.out.println("Please enter a valid positive number for height.");
        }

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}



