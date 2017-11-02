import java.io.*;

public class MatrixProgram{
	public static void main(String [] argv){
		float [][] m1 = new float[][] {{1,1},{1,1}};
		Matrix mx1 = new Matrix(m1 , 2,2);
		Matrix mx2 = new Matrix(m1 , 2,2);
		
		
		mx1.mul(mx2).show();
		
	}
}