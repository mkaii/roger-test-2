import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        HashMap<Integer,String> hMap1 = new HashMap<>();

        hMap1.put(1,"roger");
        hMap1.put(2,"mainak");
        hMap1.put(3,"michael");
        hMap1.put(4,"alex");

        System.out.println(hMap1);

        //key -> String , values -> numbers

        HashMap<String,Integer> hMap2 = new HashMap<>();

        hMap2.put("roger",1);
        hMap2.put("mainak",2);
        hMap2.put("michael",3);
        hMap2.put("alex",4);

        System.out.println(hMap2);

        // string -> string

        HashMap<String,String> hMap3 = new HashMap<>();

        hMap3.put("roger","mainak");
        hMap3.put("vikas","mainak");
        hMap3.put("mainak", "mukul");

        System.out.println(hMap3.get("mainak"));

        System.out.println(hMap3);

        // a,a,a,a,a,b,b,b,b,b,c,c,c,c,c,d,e,f,g,h,zz,z,z,z

        String[] values = {"a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "c", "c", "c", "c", "c", "d", "e", "f", "g", "h", "zz", "z", "z", "z"};

        // Convert array to ArrayList
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(values));

        //-----------------------------------------------------------
        System.out.println(arr);



        HashMap<String,Integer> freqMap = new HashMap<>();

        for(int i=0;i<arr.size();i++)
        {
            String str = arr.get(i);//str = "a"

            if(freqMap.get(str) != null)
            {
                Integer countOfStrSoFar = freqMap.get(str);
                freqMap.put(str,countOfStrSoFar+1);
            }
            else
            {
                freqMap.put(str,1);
            }
        }

        System.out.println(freqMap);

    }
}