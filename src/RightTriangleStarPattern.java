import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line of right-triangle: ");
        int lineOfTriangle = scanner.nextInt();
        rightTrianglePattern(lineOfTriangle);
    }

    public static void rightTrianglePattern(int lineNumber) {
        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
