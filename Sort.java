import java.util.Scanner;

public class Sort {
    public static String sort(double width, double height, double length, double mass) {
        double volume = width * height * length;
        boolean isBulky = volume >= 1000000 || Math.max(Math.max(width, height), length) >= 150;
        boolean isHeavy = mass >= 20;
        
        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width (cm): ");
        double width = scanner.nextDouble();
        System.out.print("Height (cm): ");
        double height = scanner.nextDouble();
        System.out.print("Length (cm): ");
        double length = scanner.nextDouble();
        System.out.print("Mass (kg): ");
        double mass = scanner.nextDouble();
        System.out.println(sort(width, height, length, mass));
        scanner.close();
    }
}
