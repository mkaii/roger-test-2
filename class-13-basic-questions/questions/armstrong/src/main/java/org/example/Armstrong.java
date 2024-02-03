package org.example;

public class Armstrong {

    //153

    public boolean isArmStrong(int n)
    {

        int initialNumber  = n;
        int sum = 0;
        while(n!=0)
        {
            int r = n%10;

            n = n/10;
            sum = sum + r*r*r;


        }

        if(sum == initialNumber) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
