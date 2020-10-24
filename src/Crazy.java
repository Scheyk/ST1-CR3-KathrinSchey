import java.util.Scanner;
import java.lang.*;

/**
 * this class is to pass the arguments with scanner
 * inside the main(String[]args) methode
 */

public class Crazy {

    public static void main(String[]args){

        for (int i = 0; i < args.length; i++){  // <---- solution with scanner to pass the arguments
            Scanner in = new Scanner(System.in);
            System.out.println("enter number");
            args[i] += in.nextInt();
        }

        int one = Integer.parseInt(args[0]);  // <--- get new argument 1
        int two = Integer.parseInt(args[1]);  // <--- get new argument 2
        int result2 = one*two;  // <--- result from argument 1 and two

        System.out.println("your result is: " + result2);
    }
}
