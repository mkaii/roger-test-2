
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Hey...Welcome to Area Calculator!!!!!");

        System.out.println("Please Supply the shape based on the menu");


        for(int i=1;i>=1;i++) {



            System.out.println("###########################");

            System.out.println("Press 1 for Rectangle");
            System.out.println("Press 2 for Triangle");
            System.out.println("Press 3 for Circle");

            int choice = sc.nextInt();

            if(choice == 1 ) {


                System.out.println("Give the dimensions of the Rectangle whose area u want to calculate ");

                System.out.println("##########");

                System.out.println("Rectangle Length............");

                int length = sc.nextInt();


                System.out.println("##########");

                System.out.println("Rectangle breadth............");

                int breadth = sc.nextInt();


                System.out.println("Length and Breadth for the given Rectangle were : Length: " + length + ", Breadth: " + breadth);

                int areaRectangle = length * breadth;

                System.out.println("######################");

                System.out.println("Area of your rectangle is: " + areaRectangle);
            }
            else if(choice == 2)
            {
                System.out.println("Give the dimensions of the Triangle whose area u want to calculate ");

                System.out.println("##########");

                System.out.println("Triangle base............");

                int base = sc.nextInt();


                System.out.println("##########");

                System.out.println("Triangle height............");

                int height = sc.nextInt();

                double areaOfTriangle = 0.5 * base * height;

                System.out.println("######################");

                System.out.println("Area of your Triangle  is: " + areaOfTriangle);
            }
            else if (choice == 3)
            {
                System.out.println("Give the dimensions of the Circle whose area u want to calculate ");

                System.out.println("##########");

                System.out.println("Circle radius............");

                int radius = sc.nextInt();

                double areaOfCircle = 3.14 * radius * radius;

                System.out.println("######################");

                System.out.println("Area of your circle  is: " + areaOfCircle);
            }
            else {
                System.out.println("Invalid shape!!!!");
                break;
            }
        }


        System.out.println("###########################");

        System.out.println("End of calculator..................");

    }
}