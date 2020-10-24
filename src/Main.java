/**
 * this class start the methos from TheMethods class
 * and has the bonus part inside.
 */

public class Main {

    public static void main(String[]args){

        // 2.calculate automatic the rectangular area.
        TheMethods rectangular = new TheMethods();
        rectangular.rectangular();  // <--- method start at line 7, end on line 18

        /*
        3. Create this solution with the usage of a new Java method calculateRectArea
        arguments: 20cm (width1) and 30cm (height1), as well as 40cm (width2) and 50cm (height2)
         */
        TheMethods calculateRectArea = new TheMethods(); // <--- method start at line 24, end on line 26
        System.out.println("The rectangular  Area is " + calculateRectArea.calculateRectArea(20,30) + "qm.");
        System.out.println("The rectangular  Area is " + calculateRectArea.calculateRectArea(40,50) + "qm.");
        System.out.println(" ");

        /*
        4. calculate the squareArea
        Example: for a square with a width = 4cm, squarePerimeter  is 16 cm;
        for a square with a width = 2cm, squarePerimeter  is 8cm
         */
        TheMethods squareArea = new TheMethods();   // <--- method start at line 29, end on line 31
        System.out.println("The square Area is " + squareArea.squareArea(4) + "qm.");
        System.out.println("The square Area is " + squareArea.squareArea(2) + "qm.");
        System.out.println(" ");

        /*
        5. Demonstrate solutions from point 3 and 4 with several method
        calls (at least 3 for each) with different arguments.
         */
        TheMethods one = new TheMethods();
        System.out.println("The rectangular Area is " + one.calculateRectArea(5,8) + "qm.");
        System.out.println(" ");

        TheMethods two = new TheMethods();
        System.out.println("The rectangular Area is " + two.calculateRectArea(2,7) + "qm.");
        System.out.println(" ");

        TheMethods three = new TheMethods();
        System.out.println("The rectangular Area is " + three.calculateRectArea(60,79) + "qm.");
        System.out.println(" ");

        TheMethods four = new TheMethods();
        System.out.println("The square Area is " + four.squareArea(77) + "qm.");
        System.out.println(" ");

        TheMethods five = new TheMethods();
        System.out.println("The square Area is " + five.squareArea(8) + "qm.");
        System.out.println(" ");

        TheMethods six = new TheMethods();
        System.out.println("The square Area is " + six.squareArea(35) + "qm.");
        System.out.println(" ");

        // ########## start bonus part ################
        /*
        Save your test data (several widths / heights) for several different rectangles.
        Think about the data structure you want to use. Use a for loop to perform rectangular
        surface calculation and display the results of your calculation.
         */
        int[] array = {one.calculateRectArea(8,89), two.calculateRectArea(22,77), three.calculateRectArea(64,8)};

        for(int i = 0; i < array.length; i++){
            System.out.println("result " + i + " is: " + array[i]);
            System.out.println(" ");
        }

        /*
        Create a Java program, that accepts width and height of a rectangular as
        arguments passed to the main() method and displays the solution in the console.
         */
        for(int i = 0; i < args.length; i++){   // <--- solution with fix arguments.
            System.out.println("Argument " + i + " from Main Class: " + args[i]);
            System.out.println(" ");
        }

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int result = width*height;
        System.out.println("the the solution from the main is: " + result);
    }
}
