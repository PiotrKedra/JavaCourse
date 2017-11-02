package zad4;

import javax.imageio.IIOException;
import java.io.IOException;

public class TestCrypth {
    public static void main(String [] args){
        ROT11 testROT11 = new ROT11();
        Polibius testPol = new Polibius();

        try {
            Crypthographer.cryptfile("first.txt", "second.txt", testPol);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
