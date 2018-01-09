package testing;

public class a {
    int number=0;
    protected String name="";


    public a(){}
    public void callDecrement(){decrement();}
    public void callIncrement(){increment();}
    public void callChangeName() {changeName();}
    private void increment(){this.number--;}
    protected void decrement(){this.number++;}
    void changeName(){this.name+="a";}

    /*public static void main(String[] args) {
        b b = new b();
        b.callDecrement();b.callIncrement();b.callChangeName();
        a a =b;
        a.callDecrement();b.callIncrement();a.callChangeName();
        b = (b)a;
        b.callIncrement();b.callChangeName();
        System.out.println(b.number);
        System.out.println(b.name);
    }*/

    /*public static void main(String[] args) {
        a a=new a();
        a.callIncrement();
        b b =new b();
        b.callDecrement();
        a=b;
        a.callDecrement();
        System.out.println(a.number);
    }*/

    public int getNumber() {
        return number;
    }
}
