import java.io.*;

public class PrimeNumbers{
	void GetPrimeNumbers(int n){
		for(int i=2;i<n;++i){
			int divisors = 0;
			for(int j=2; j<(int)(i/2 + 2); ++j){
				if(i%j == 0) ++divisors;
			}
			if(divisors == 0) System.out.println(i);
		}
	}
}