import java.util.Scanner;

public class FamilyAgeRanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many member does your family have? : ");
        int familyMemberNumber = scanner.nextInt();

        for (int i = 1; i <= familyMemberNumber; i++) {
            System.out.println("Enter the age for a member: ");
            int memberAge = scanner.nextInt();
            calculateAgeRange(memberAge);
        }
    }

    public static void calculateAgeRange(int memberAge) {
        if ((memberAge >= 0) && (memberAge <= 120)) {
            if (memberAge <= 3) {
                System.out.println("This member is a baby.");
            } else if (memberAge <= 12) {
                System.out.println("This member is a children.");
            } else if (memberAge <= 19) {
                System.out.println("This member is a teenager.");
            } else if (memberAge <= 30) {
                System.out.println("This member is a young adult.");
            } else if (memberAge <= 59) {
                System.out.println("This member is an adulthood.");
            } else {
                System.out.println("This member is an elderly.");
            }
        } else {
            System.out.println("Enter a number between 0-120 !");
        }
    }
}

