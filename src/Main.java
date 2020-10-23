import java.lang.reflect.Array;

public class Main {

    public static void main(String[]args){

        TheMethods rectangular = new TheMethods();
        rectangular.rectangular();

        TheMethods calculateRectArea = new TheMethods();
        System.out.println("The rectangular  Area is " + calculateRectArea.calculateRectArea(20,30) + "qm.");
        System.out.println("The rectangular  Area is " + calculateRectArea.calculateRectArea(40,50) + "qm.");
        System.out.println(" ");

        TheMethods squareArea = new TheMethods();
        System.out.println("The square Area is " + squareArea.squareArea(4) + "qm.");
        System.out.println("The square Area is " + squareArea.squareArea(2) + "qm.");
        System.out.println(" ");

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

        int[] array = {one.calculateRectArea(8,89), two.calculateRectArea(22,77), three.calculateRectArea(64,8)};

        for(int elements : array){
            System.out.println("result: " + elements);
            System.out.println(" ");
        }

        for(int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }

    }
}
