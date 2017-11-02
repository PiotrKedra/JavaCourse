package zad3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt3D extends Punkt2D{
    double _z;
    public Punkt3D(double x, double y, double z){
        super(x,y);
        _z = z;
    }

    public void setZ(double z){
        _z = z;
    }

    public double getZ(){
        return _z;
    }

    public double distance(Punkt3D pkt){
        return sqrt(pow(this.getX() - pkt.getX(),2)+pow(this.getY() - pkt.getY(),2)+pow(this.getZ() - pkt.getZ(),2));
    }

    public void show(){
        System.out.println("( "+_x+", "+_y+", "+_z+')');
    }
}
