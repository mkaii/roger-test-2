// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.print();
        c1.wrestle();

        System.out.println("------------");

        Parent p1 = new Parent();
        p1.print();
        p1.wrestle();

        System.out.println("------------");

        Parent p3 = new Child(); //type of reference is parent , type of object is Child
        p3.wrestle(); //overridden method to be called is decided based on the type of object

    }
}