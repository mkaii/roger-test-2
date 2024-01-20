import java.util.ArrayList;

public class Helper {

    // create the methods here

    // to create a method which takes as array list and returns the sum of all elements in that arraylist

    public int sumOfArray(ArrayList<Integer> arr)
    {
        int sum = 0;

        for(int i=0;i< arr.size();i++)
        {
            sum = sum + arr.get(i);
        }

        return sum;
    }


    public void productOfArray(ArrayList<Integer> arr)// 1 21 3 4
    {
        int product = 1;

        for(int i=0;i< arr.size();i++)
        {
            product = product * arr.get(i);

        }

        System.out.println(product);

    }




}
