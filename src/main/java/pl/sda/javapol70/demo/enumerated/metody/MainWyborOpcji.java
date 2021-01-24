package pl.sda.javapol70.demo.enumerated.metody;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 13:54
 * @Project demo_javapol70
 */
public class MainWyborOpcji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // jeśli wczytujemy nazwę od użytkownika
        RodzajNadwozia rodzaj;
        do {
            System.out.println("Podaj rodzaj nadwozia: ");
            System.out.println("Dostępne opcje: ");
            for (int i = 0; i < RodzajNadwozia.values().length; i++) {
                System.out.println(i + " -> " + RodzajNadwozia.values()[i]);
            }

            int rodzajNadwCyfra = scanner.nextInt();
            switch (rodzajNadwCyfra) {
                case 0:
                    rodzaj = RodzajNadwozia.SEDAN;
                    break;
                case 1:
                    rodzaj = RodzajNadwozia.KOMBI;
                    break;
                case 2:
                    rodzaj = RodzajNadwozia.SUV;
                    break;
                case 3:
                    rodzaj = RodzajNadwozia.KABRIO;
                    break;
                default:
                    rodzaj = null;
                    break;
            }
        }while (rodzaj == null);

        System.out.println("Wybrana opcja: " + rodzaj);
    }
}
