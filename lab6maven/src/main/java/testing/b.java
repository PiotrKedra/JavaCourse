package testing;

public class b extends a {
    @Override
    protected void decrement() {
        this.number+=10;
    }

    @Override
    void changeName() {
        name+="b";
    }
    private void increment(){number-=10;}


}
/*

1.
b] +10 -1 +b

a] +10 (b] -1) a] +b

-1 +b

18 bbb

1.
-10  +b

-10  +b

+1   +b

2.
+1

nie mozna kastowac A na B jezeli A nie bylo wczesniej B( B b= (B)a; )

3.

1

-10

+b

+b

+b


marcin.lenart@me.com
 */