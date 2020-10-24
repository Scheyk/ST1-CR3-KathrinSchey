import java.util.Scanner;

/**
 * this class have only methods for the Main class
 */

public class TheMethods {

    // calculate rechteck with scanner
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

    // calculate rechteck
    static int calculateRectArea(int a, int b){
        return a*b;
    }

    // calculate the squareArea
    static int squareArea(int a){
        return a*4;
    }

}
