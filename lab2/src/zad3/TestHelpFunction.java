package zad3;
import com.company.*;

import java.util.Iterator;
import java.util.LinkedList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static javafx.application.Platform.exit;

public class TestHelpFunction {
    private LinkedList<Punkt3D> points;

    public TestHelpFunction(){
        points = new LinkedList<Punkt3D>();
    }

    public void menu(){
        JIn n = new JIn();
        System.out.println("1. Wczytaj punkt 3D ");
        System.out.println("2. Wyswietl wszystkie punkty ");
        System.out.println("3. Oblicz odległosc ");
        System.out.println("4. Zakoncz ");

        int number = n.getInt();
        if(number==1){
            this.read();
            this.menu();
        }
        else if(number==2){
            this.show();
            this.menu();
        }
        else if(number==3){
            this.distance();
            this.menu();
        }
        else if(number==4){exit();}
    }
    private void read(){
        double x,y,z;
        JIn n = new JIn();
        System.out.println("Podaj x: ");
        x = n.getDouble();
        System.out.println("Podaj y: ");
        y = n.getDouble();
        System.out.println("Podaj z: ");
        z = n.getDouble();
        Punkt3D pkt = new Punkt3D(x,y,z);
        this.points.addLast(pkt);
    }

    private void show() {
        for (Punkt3D pkt : this.points) {
            pkt.show();
        }
    }
    private void distance(){
        this.read();
        this.read();

        int almost_last = points.indexOf(points.getLast())-1;
        double value= points.getLast().distance(points.get(almost_last));

        System.out.println("Dystans: "+value);
    }
}
