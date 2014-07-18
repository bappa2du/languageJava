interface Callback
{
    void callback(int param);
}

class Client implements Callback
{
    public void callback(int p)
    {
        System.out.println("callback called with "+p);
    }
}
class interfaceclass
{
    public static void main(String args[])
    {
        Callback call  = new Client();
        call.callback(42);
    }
}

