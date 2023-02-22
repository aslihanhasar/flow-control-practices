import java.util.Scanner;
public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width=scanner.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int length=scanner.nextInt();
        System.out.println("Filled rectangle pattern: ");
        filledRectanglePattern(width,length);
        System.out.println("Void rectangle pattern: ");
        voidRectanglePattern(width,length);

    }

    public static void filledRectanglePattern(int width,int length){
        for (int row=1;row<=length;row++){
            for (int col=1;col<=width;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void voidRectanglePattern(int width,int length){
        for (int row=1;row<=length;row++){
            for (int col=1;col<=width;col++){
                if ((row==1)||(row==length)) {
                    System.out.print(" * ");
                }else{
                    if ((col==1)||(col==width)){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
