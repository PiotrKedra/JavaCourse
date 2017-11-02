package com.company;
import zad3.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Punkt2D pkt = new Punkt2D(0,0);
        Punkt2D pkt2 = new Punkt2D(3,4);

        Punkt3D pkt3d = new Punkt3D(1,3,4);
        Punkt3D pkt3d2 = new Punkt3D(-1,-3,-4);

        System.out.println(pkt.distance(pkt2));
        System.out.println(pkt3d.distance(pkt3d2
        ));
    }
}
