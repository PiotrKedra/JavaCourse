package zad1;

import zad2.DummyMatrix;

import java.io.IOException;

public class MatrixMain {
    public static void main(String [] argv){
        float [][] m1 = new float[][] {{1,1,1},{1,1,1},{1,1,1}};
        float [][] m2 = new float[][] {{1,1,1}, {1,1,1},{1,1,1}};
        DummyMatrix mx1 = new DummyMatrix(m1 , 3,3);
        DummyMatrix mx2 = new DummyMatrix(m2 , 3,3);


        mx1.mul(mx2).show();

        /*try{
            Matrix test = new Matrix("matrix.txt");
            test.show();
        }catch (IOException e){
            e.printStackTrace();
        }*/

    }
}

