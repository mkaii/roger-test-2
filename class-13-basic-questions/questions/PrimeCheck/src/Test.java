public class Test {


    void sum(int a, int b)
    {
        System.out.println("abcd" +a+b);
    }

    public boolean isNumberPrime(int n)
    {
        for(int i=2;i<=(n-1);i++) //i<n
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
}
