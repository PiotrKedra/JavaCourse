package zad1;

import java.util.LinkedList;


public class zad1
{

    public void sth(final double vaa){
        //vaa=123; nie mozna tak
    }
    public void sth2(final LinkedList<Double> var){
        //var.add(123.23);
        var.remove(1);
        var.clear();

        LinkedList<Double> nest = new LinkedList<Double>();

        //var = nest;  tak tez
    }
}
