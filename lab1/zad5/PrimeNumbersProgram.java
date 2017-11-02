import java.io.*;

public class PrimeNumbersProgram{
	public static void main(String [] argv){
		PrimeNumbers numbers = new PrimeNumbers();
		JIn n = new JIn();
		
		System.out.print("Podaj liczbe: ");
		int n1 = n.getInt();
		
		numbers.GetPrimeNumbers(n1);
	
	}
}