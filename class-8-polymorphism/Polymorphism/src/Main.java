// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //method 1
    public static void helper(int x)
    {
        System.out.println("the number is :"  + x);
    }


    //method 2
    public static void helper(int x, int y)
    {
        System.out.println(x*y);
    }


    //method 3
    public static void helper(String x)
    {
        System.out.println("The String is " + x);
    }


    public static void main(String[] args) {

        helper(2); //m1 would be called

        helper("2"); //m3 would be called

        helper(3,4); //m2 would be called

        // helper method is acting in different forms/ways based on the type of parameter that u call the method with.

        //helper method is overloaded

        //call methods of Example class

        Example obj = new Example();

        obj.func("roger");

    }
}