import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line of triangle: ");
        int lineOfTriangle = scanner.nextInt();
        trianglePattern(lineOfTriangle);
    }

    public static void trianglePattern(int lineNumber) {
        for (int i = 0; i < lineNumber; i++) {
            for (int space = 1; space < lineNumber - i; space++) {
                System.out.print("   ");
            }
            for (int star = 1; star <= (2 * i) + 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
