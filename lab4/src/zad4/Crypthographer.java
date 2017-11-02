package zad4;

import java.io.*;
import java.util.Scanner;

class Crypthographer {
    static void cryptfile(String fileToRead, String fileToWrite, Algorithm algorithm) throws IOException{
        BufferedReader fileIn = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileToWrite));

        while (fileIn.ready()){
            String line = fileIn.readLine();
            for(String word: line.split(" ")){
                fileOut.write(algorithm.crypt(word)+" ");
            }
            fileOut.newLine();
        }

        fileIn.close();
        fileOut.close();
    }
    static void decryptfile(String fileToRead, String fileToWrite, Algorithm algorithm) throws IOException{
        BufferedReader fileIn = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileToWrite));

        while (fileIn.ready()){
            String line = fileIn.readLine();
            for(String word: line.split(" ")){
                fileOut.write(algorithm.decrypt(word)+" ");
            }
            fileOut.newLine();
        }

        fileIn.close();
        fileOut.close();
    }
}


