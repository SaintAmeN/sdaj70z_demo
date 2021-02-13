package pl.sda.javapol70.demo.files.odczyt;

import java.io.*;

/**
 * @Author amen
 * @Created 13.02.2021 17:41
 * @Project demo_javapol70
 */
public class MainOdczyt {
    public static void main(String[] args) {
        // Klasy czytające:
        // BufferedReader
        // Scanner

        String filename = "plik.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){

            // czytamy linia po linii i wypisujemy treść.
            String linia;

            System.out.println("Treść pliku: ");
            while ((linia = reader.readLine()) != null){// dopóki jest co czytać
                System.err.println(linia);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
