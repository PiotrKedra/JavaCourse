package egzamin107;

import testing.a;
import testing.b;

public class c extends b {
    public void changeName() {this.name = "c";}
    public void decrement() {this.name="c";}

    public static void main(String[] args) {
        c c=new c();c.callIncrement();c.callDecrement(); //-1 c
        a a=c; a.callChangeName();a.callDecrement(); // +c c
        b b=(b)a;b.callChangeName(); // +c
        System.out.println(b.getNumber());
        c=(c)b; c.callChangeName();// +c
        System.out.println(c.name);
    }

    //-1
    //cbb
}
