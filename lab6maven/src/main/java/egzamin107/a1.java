package egzamin107;

public class a1 {
    void foo(){
        System.out.println("A");
    }

    a1(){foo();}
    public static void main(String[] args) {
        new b1().foo();
    }
}


