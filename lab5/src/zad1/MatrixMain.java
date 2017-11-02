package zad1;

import java.io.IOException;

public class MatrixMain {
    public static void main(String [] argv){
        float [][] m1 = new float[][] {{1,1},{1,1}};
        Matrix mx1 = new Matrix(m1 , 2,2);
        Matrix mx2 = new Matrix(m1 , 2,2);


        mx1.mul(mx2).show();

        try{
            Matrix test = new Matrix("matrix.txt");
            test.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

