package pl.sda.javapol70.demo.dziedziczenie.ptaszki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author amen
 * @Created 23.01.2021 09:39
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        Ptak p2 = new Gołąb();
        p2.spiewaj(); // papidipupi
        if( p2 instanceof Gołąb) {
            // postrzegaj p2 jako "Gołąb"
            Gołąb g = (Gołąb) p2;
        }


        Ptak p1 = new Sowa();
        p1.spiewaj(); // hu hu

        Sowa s = new Sowa();
        s.spiewaj(); // hu hu

        Set<Ptak> zbior = new HashSet<>();
        zbior.add(p1);
        zbior.add(s);
        zbior.add(new Kukułka());

        for (Ptak ptak : zbior) {
            ptak.spiewaj();
        }

        List<String> lista = new ArrayList<>();

        double pierwsza = 3;
        double druga = 1;

        double wynik = pierwsza / druga;
        System.out.println(wynik);      // 3.0
        System.out.println((int)wynik); // 3

        Gołąb g = new Gołąb();
        g.spiewaj(); // GU GU
        g.spiewaj("Kolędy");
        g.spiewaj(3);
    }
}
