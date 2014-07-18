class AA
{
    int i,j;
    AA(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j "+i+" "+j);
    }
}
class BB extends AA
{
    int k;
    BB(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show()
    {
        System.out.println("K is "+k);
    }
}

class override
{
    public static void main(String args[])
    {
        BB subobj = new BB(1,2,3);
        
        subobj.show();
    }
}