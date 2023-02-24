import java.util.Scanner;
public class MonteCarloPi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of points: ");
        int numberOfPoint=scanner.nextInt();
        int numberInCircle=0;

        for (int i=0;i<numberOfPoint;i++){
           double x=Math.random();
           double y=Math.random();
           double distance=(x*x)+(y*y);
            if(distance<=1){
                numberInCircle++;
            }
        }
        double piNumber=4.0*numberInCircle/numberOfPoint;
        System.out.println("Estimating Pi Number: "+piNumber);
        System.out.println("Pi Number in Java: "+Math.PI);
    }
}
