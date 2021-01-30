package pl.sda.javapol70.demo.wyjatki.lapanie_jawny_niejawny;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author amen
 * @Created 30.01.2021 12:37
 * @Project demo_javapol70
 */
public class MainPoCoFinally {
    public static void main(String[] args) {

        // najpierw wykona się finally, potem wypisze się wynik
        System.out.println(instrukcja());
    }

    private static int instrukcja() {
        PrintWriter writer = null; // stwórz wypisywacz
        try {
            writer = new PrintWriter("plik.txt"); // otwórz plik (potencjalnie błąd)
//            new PrintWriter("plik.txt"); // Null pointer exception
            // Null..
            writer.println("cos"); // wypisz cos

            return 0; // -> i potem wykona się finally
        } catch (IOException ioe) { //input/output exception (operacje dyskowe/klawiatura wejście/wyjście)
            System.out.println(ioe);

            return 1; // -> i potem wykona się finally
            // w przypadku wyjątku którego nie przechwyciliśmy -> i potem wykona się finally.
        } finally {
            System.out.println("Finally, skończyłem tą instrukcję.");
            if (writer != null) { // jeśli jest różny to zamknij
                writer.close();
            }
            System.out.println("Zamykam");
        }
    }
}
