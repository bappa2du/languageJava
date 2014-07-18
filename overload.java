class apple
{
    int i,j;
    
    apple(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j : "+i+" "+j);
    }
}
class myapple extends apple
{
    int k;
    myapple(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(String msg)
    {
        System.out.println(msg+k);
    }
}

class overload
{
    public static void main(String args[])
    {
        myapple subobj = new myapple(1,2,3);
        
        subobj.show();
        
        subobj.show("this is k ");
    }
}