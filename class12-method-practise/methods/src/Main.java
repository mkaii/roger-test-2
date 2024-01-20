import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        Helper helper = new Helper();

        // to create a method which takes as array list and returns the sum of all elements

        ArrayList<Integer> anyList = new ArrayList<>();
        anyList.add(1);
        anyList.add(21);
        anyList.add(3);
        anyList.add(4);

        //int sum = helper.sumOfArray(anyList);


        //System.out.println(sum);


        helper.productOfArray(anyList);




    }
}