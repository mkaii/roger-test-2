package org.example;

public class CheckStrongNumber {


    private int factorial(int r) {


        int product = 1;
        for(int i = r; i>=1;i--)
        {
            product = product*i;
        }

        return product;
    }

    void isNumberStrong(int n)
    {
        int originalNumber = n;

        int sum = 0;
        while(n!=0)
        {
            int r = n%10;
            n = n/10;

            sum = sum + factorial(r);

        }


        if(sum == originalNumber )
        {
            System.out.println(originalNumber  + " is a strong number");
        }
        else {
            System.out.println(originalNumber  + " is not a strong number");
        }
    }


}
