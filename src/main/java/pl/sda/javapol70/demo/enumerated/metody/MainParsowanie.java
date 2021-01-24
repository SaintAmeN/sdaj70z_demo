package pl.sda.javapol70.demo.enumerated.metody;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 13:54
 * @Project demo_javapol70
 */
public class MainParsowanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // jeśli wczytujemy nazwę od użytkownika
        System.out.println("Podaj rodzaj nadwozia: ");
        System.out.println("Dostępne opcje: " + Arrays.asList(RodzajNadwozia.values()));
        String rodzajNadw = scanner.nextLine();

        rodzajNadw = rodzajNadw.toUpperCase(); // seDAN -> SEDAN
        rodzajNadw = rodzajNadw.trim(); // "SEDAN " -> "SEDAN"

        // Jeśli posiadamy tekstową wartość która odpowiada nazwie Enuma, to
        //  możemy użyć metody 'valueOf' aby zamienić typ "String" -> "RodzajNadwozia"
        RodzajNadwozia zmiennaRodzaj = RodzajNadwozia.valueOf(rodzajNadw);
    }
}
