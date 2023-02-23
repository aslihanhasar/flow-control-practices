import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElement;
        do {
            System.out.print("Enter the number of elements of the fibonacci sequence: ");
            numberOfElement = scanner.nextInt();

            if (numberOfElement == 1) {
                System.out.println("Fibonacci Numbers: 0");
            } else if (numberOfElement == 2) {
                System.out.println("Fibonacci Numbers: 0,1");
            } else {
                System.out.print("Fibonacci Numbers:");
                checkFibonacciNumbers(numberOfElement);
                System.out.println(numberOfElement + ". element of the sequence is " + fibonacciWithRecursion(numberOfElement));
            }

        } while (numberOfElement > 0);
    }

    static void checkFibonacciNumbers(int numberOfElement) {
        int a = 0, b = 1;
        int tempNumber;
        System.out.print(a + "," + b);

        for (int i = 3; i <= numberOfElement; i++) {
            tempNumber = b;
            b += a;
            a = tempNumber;
            System.out.print("," + b);
        }
        System.out.println();
    }

    static int fibonacciWithRecursion(int numberOfElement) {
        if (numberOfElement == 1) {
            return 0;
        } else if (numberOfElement == 2) {
            return 1;
        }
        return fibonacciWithRecursion(numberOfElement - 1) + fibonacciWithRecursion(numberOfElement - 2);
    }
}

