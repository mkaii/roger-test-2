
public class Roger {
    public static void main(String[] args) {

        System.out.println("Roger is trying to learn Java!!");


        //how do we create an object :

        Car car1 = new Car();

        car1.setColor("blue");

        System.out.println(car1.getColour());

       Car c2 =  new Car();

       c2.setColor("red");

       System.out.println(c2.getColour());

       Dog d1 = new Dog();

       System.out.println(d1.bark());

    }
}