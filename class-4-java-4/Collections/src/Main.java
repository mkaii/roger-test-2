import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


        ArrayList<String> arr = new ArrayList<>();


        // add elements to the list

        System.out.println("size: "  + arr.size() );
        arr.add("roger");
        System.out.println("size: "  + arr.size() );
        arr.add("Mainak");
        System.out.println("size: "  + arr.size() );
        arr.add("roger");
        System.out.println("size: "  + arr.size() );
        arr.add("Mainak");
        System.out.println("size: "  + arr.size() );
        arr.add("roger");
        System.out.println("size: "  + arr.size() );
        arr.add("Mainak");
        System.out.println("size: "  + arr.size() );
        arr.add("roger");
        System.out.println("size: "  + arr.size() );
        arr.add("Mainak");
        System.out.println("size: "  + arr.size() );

        System.out.println(arr);

        System.out.println("---------------------------------------------------");

        ArrayList<String> rogerList = new ArrayList<>();


        rogerList.add("abcd");
        rogerList.add("roger");
        System.out.println(rogerList.size());

       /* for(int i=0;i <= arr.size()-1;++i)
        {
            rogerList.add(arr.get(i));
        }*/


        rogerList.addAll(arr);

        System.out.println(rogerList);



        rogerList.set(9,"abcd");

        System.out.println(rogerList);

        //delete

        rogerList.remove(9);

        System.out.println(rogerList);

        //sorting arraylist

        Collections.sort(rogerList);

        System.out.println(rogerList);

    }
}