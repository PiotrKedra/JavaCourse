import java.io.*;
import java.util.Scanner;

public class JIn {
    public static String getString() {
	  String text = null;
	  try{
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(rd);
		text = bfr.readLine();
	  }catch(IOException e){e.printStackTrace();}
      return text;	  
    }
	public static int getInt(){
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		return n;
	}
}