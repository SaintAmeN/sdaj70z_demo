package pl.sda.javapol70.demo.files.zapis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author amen
 * @Created 13.02.2021 17:45
 * @Project demo_javapol70
 */
public class MainZapis {
    public static void main(String[] args) {
        String filename = "plik.txt";

        // Writer       // bajty
        // PrintWriter  // tekst
        // FileWriter   // tekst do pliku

//        try-catch
//        try {
//            FileWriter writer = new FileWriter(new File(filename));
//
//            writer.write("Linia tekstu.");
//            writer.flush(); // wypchnij i upewnij sie ze zapisze na dysk TERAZ
//
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try-with-resources
        // jeśli append nie jest dostarczone lub jest false, to przy otwieraniu pliku
        // plik zostanie nadpisany
        try (FileWriter writer = new FileWriter(new File(filename), true)){
            writer.write("Linia tekstu.");
            writer.flush(); // wypchnij i upewnij sie ze zapisze na dysk TERAZ

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
