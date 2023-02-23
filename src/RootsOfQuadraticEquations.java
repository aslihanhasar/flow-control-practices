import java.util.Scanner;

public class RootsOfQuadraticEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients of the quadratic equation. (ax^2+bx+c = 0) ");

        System.out.print("Enter a : ");
        int a = scanner.nextInt();

        System.out.print("Enter b : ");
        int b = scanner.nextInt();

        System.out.print("Enter c : ");
        int c = scanner.nextInt();

        if (calculateDiscriminant(a, b, c) > 0) {
            System.out.println("The roots are real and distinct.");
            calculateTwoRealRoots(calculateDiscriminant(a, b, c), a, b);
        } else if (calculateDiscriminant(a, b, c) == 0) {
            System.out.println("The roots are real and equals.");
            calculateOneRealRoot(a, b);
        } else if (calculateDiscriminant(a, b, c) < 0) {
            System.out.println("The roots do not exist or the roots are imaginary.");
        }
    }

    static int calculateDiscriminant(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    static void calculateTwoRealRoots(int discriminant, int a, int b) {
        double rootOne, rootTwo;
        rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
        rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("The roots of the equation:" +
                "\n1.: " + rootOne +
                "\n2.: " + rootTwo);
    }

    static void calculateOneRealRoot(int a, int b) {
        int rootOfEquation = (-b) / (2 * a);
        System.out.println("The roots of the equation: " + rootOfEquation);
    }

}
