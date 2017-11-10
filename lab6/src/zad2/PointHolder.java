package zad2;

import java.util.LinkedList;

public class PointHolder {
    LinkedList<DrawPoint> function;

    PointHolder(){
        function = new LinkedList<DrawPoint>();
        for(int i=0;i<600;++i){
            DrawPoint point = new DrawPoint();
            point.setCords(i,i*i);
            function.add(point);
        }
    }


}
