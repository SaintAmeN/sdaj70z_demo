package pl.sda.javapol70.demo.files.odczyt;

import java.io.*;

/**
 * @Author amen
 * @Created 13.02.2021 17:41
 * @Project demo_javapol70
 */
public class MainOdczyt {
    public static void main(String[] args) {

        // Czytanie:
        // - Reader (czyta) [bity/bajty skądś]
        // - Input/Output Reader [sieci/urządzenia/dyski/pliki, bajty, tablice bajtów]
        // - InputStreamReader (System.in - konsola)
        // -- FileReader
        // -- DataInputReader
        // --- BufferedReader
        // --- Scanner

        // Klasy czytające:
        // BufferedReader
        // Scanner

        String filename = "plik.txt";
        File file = new File(filename); // ta instrukcja nie tworzy pliku!
        if(!file.exists()){
            System.err.println("Plik nie istnieje.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            // czytamy linia po linii i wypisujemy treść.
            String linia;

            System.out.println("Treść pliku: ");
            while ((linia = reader.readLine()) != null) {// dopóki jest co czytać
                System.err.println(linia);
            }

//            reader.lines()

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
