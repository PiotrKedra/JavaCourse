package zad_wczytac_zapisac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestInOut {
    public static void main(String [] argv) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("test3.txt");
        zapis.println("szprzedam Ci rogale"); // to nadpisuje wszystko, not that good ^^
        zapis.close();

        String text="";
        Scanner file = new Scanner(new File("test3.txt"));
        // plik musi sie znajdowac w najwyszym katalogu

        while(file.hasNext()) {
            text += file.nextLine() + '\n';
        }
        System.out.println(text);

    }
}
