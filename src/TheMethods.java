import java.util.Scanner;

public class TheMethods {

    /* 2. Create a solution for the following problem: given a width and a height of
    a rectangular (image below, left side), calculate the rectangular area. */
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

    /*
    Create this solution with the usage of a new Java method calculateRectArea, that
    returns a computed value
     */
    static int calculateRectArea(int a, int b){
        return a*b;
    }

    // calculate the squareArea
    static int squareArea(int a){
        return a*4;
    }


}
