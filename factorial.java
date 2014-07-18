class factorial
{
    public static void main(String[] args)
    {
        fact myfact = new fact();
        System.out.println(myfact.fact(4));
    }
    
}

class fact
{
    int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}

