// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent();

        p1.print2();

        Child c1 = new Child();

        c1.print2();

        //call the helper method in child class

        c1.helper();

       // p1.helper(); - wont work

        c1.caller();
    }
}