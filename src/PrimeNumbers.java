import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        if (isPrimeNumber(getNumber())) {
            System.out.println("This number is a prime number.");
        } else {
            System.out.println("This number is not a prime number. ");
        }
        checkAllPrimeNumbersUpTo(getNumber());
        //checkAllPrimeNumbers(getNumber());
    }

    static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    static boolean isPrimeNumber(int number) {
        int flag = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                flag++;
            }
        }
        return flag == 1;
    }
    static void checkAllPrimeNumbersUpTo(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (isPrimeNumber(i)) {
                counter++;
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
        System.out.print("Total number of prime numbers up to the entered number :" + counter);
    }

   /*
    static void checkAllPrimeNumbers(int number) {
        int flag, counter = 0;
        for (int i = 2; i <= number; i++) {
            flag = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 1) {
                counter++;
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
        System.out.print("Total number of prime numbers up to the entered number :" + counter);
    }
    */
}
