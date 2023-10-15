
public class Roger {
    public static void main(String[] args) {

        System.out.println("Roger is trying to learn Java!!");


        //how do we create an object :

        /*Car car1 = new Car();

        car1.setColor("blue");

        System.out.println(car1.getColour());

       Car c2 =  new Car();

       c2.setColor("red");

       System.out.println(c2.getColour());

       Dog d1 = new Dog();

       System.out.println(d1.bark());*/

       Airplane a1 = new Airplane();

       //a1.seats = 100; //correct

       // a1.seats(100); --wrong

        a1.updateSeats(100);


        //cannot access seat directly because that was private
        //so we created a getter on the seats property which is public
        System.out.println(a1.retrieveSeats());

        a1.setName("air force 1");

        //see what value was there in "name" property of a1
        System.out.println(a1.getName());


        // up till now we have used setters to set/update the properties of an object

        //there is a way to pass and set these values during object creation itself:


        //whenever object is created (always using the new keyword) - a constructor is called
        Airplane a2 = new Airplane(50,100,"gold","Aero");
        System.out.println(a2.retrieveSeats());




    }
}