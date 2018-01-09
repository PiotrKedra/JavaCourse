package egzamin107;

public class b1 extends a1 {
    void foo() {
        System.out.println("B");
    }
    b1() {
        foo() ;
        super.foo();
        ((a1)this).foo();
    }

}
