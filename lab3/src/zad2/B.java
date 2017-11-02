package zad2;

public class B extends A {
    static class Thing extends A.Thing{
        public int value2() {return 20; }
    }

    private Thing makeThing() { return new Thing(); }


}
