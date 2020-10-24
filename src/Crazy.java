import java.util.Scanner;
import java.lang.*;

/**
 * this class is to pass the arguments with scanner
 * inside the main(String[]args) methode
 */

public class Crazy {

    public static void main(String[]args){

        System.out.println("enter two numbers to know the qm");

        for (int i = 0; i < args.length; i++){  // <---- solution with scanner to pass the arguments
            Scanner in = new Scanner(System.in);
            System.out.println("enter number");
            args[i] += in.nextInt();
        }

        int width = Integer.parseInt(args[0]);  // <--- get new argument 1
        int height = Integer.parseInt(args[1]);  // <--- get new argument 2
        int result2 = width*height;  // <--- result from argument 1 and two

        System.out.println("your result is: " + result2);
    }
}
