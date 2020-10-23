import java.util.Scanner;

public class TheMethods {

    static void rectangular(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter the length");
        double l = in.nextDouble();
        System.out.println("enter the width");
        double w = in.nextDouble();

        double result = l*w;
        System.out.println("The area of this rectangular is: " + result);
        System.out.println(" ");
    }

    static int calculateRectArea(int a, int b){
        return a*b;
    }

    static int squareArea(int a){
        return a*4;
    }


}
