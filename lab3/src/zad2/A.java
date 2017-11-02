package zad2;

public class A {
    static class Thing{
        public int value(){ return 10+value2(); }
        public int value2() { return 10; }
    }

    private Thing makeThing() { return new Thing(); }

    public String toString() {
        Thing t = new Thing();
        return Integer.toString((t.value()));
    }
}
