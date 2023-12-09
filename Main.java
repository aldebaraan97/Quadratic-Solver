import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Obtain values for a b c
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Compute the general formula
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
        double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
        boolean isPositive = discriminant > 0;

        // Display results
        if (discriminant < 0){
            System.out.println("The equations has no real solutions");
        }
        else{
            System.out.println("The equation has " + ((isPositive) ? "Two roots: " + root1 + " and " + root2 : "one root: " + root1));
        }
    }
}