import java.io.*;

public class Reader{
  public static void main(String[] argv){
	InputStreamReader rd = new InputStreamReader(System.in);
	BufferedReader bfr = new BufferedReader(rd);
	
	String text = "";
	try{
	System.out.print("Wpisz jakis tekst: ");
	text = bfr.readLine();
	}catch(IOException e){e.printStackTrace();}
	System.out.println("Wpisales: "+text);
  }
}	