package zad3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt2D {
    double _x;
    double _y;

    public Punkt2D(double x, double y){
        _x = x;
        _y = y;
    }

    public double getX(){
        return _x;
    }

    public double getY(){
        return _y;
    }

    public void setX(double x){
        _x = x;
    }

    public void setY(double y){
        _y = y;
    }

    public double distance(Punkt2D punkt2d){
        return sqrt(pow(this.getX() - punkt2d.getX(),2)+pow(this.getY() - punkt2d.getY(),2));
    }

}
