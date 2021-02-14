package pl.sda.javapol70.demo.files.zapis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramSocketImpl;

/**
 * @Author amen
 * @Created 13.02.2021 17:45
 * @Project demo_javapol70
 */
public class MainZapis {
    public static void main(String[] args) {
        String filename = "plik.txt";

        // Zapis:
        // - Writer (czyta) [bity/bajty skądś]
        // - Input/Output Writer [sieci/urządzenia/dyski/pliki, bajty, tablice bajtów]
        // - OutputStreamWriter (System.out - konsola)
        // -- FileWriter
        // -- PrintWriter

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
        try (FileWriter writer = new FileWriter(new File(filename), true)) {

//            for (int i = 0; i < 10; i++) {
                writer.write("Linia tekstu.\n");
                writer.flush(); // wypchnij i upewnij sie ze zapisze na dysk TERAZ

                System.out.println("Napisałem linie.");
//                Thread.sleep(10000);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } /*catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
