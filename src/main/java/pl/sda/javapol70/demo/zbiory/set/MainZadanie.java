package pl.sda.javapol70.demo.zbiory.set;

import java.util.*;

/**
 * @Author amen
 * @Created 23.01.2021 11:20
 * @Project demo_javapol70
 */
public class MainZadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj linię tekstu:");
        String linia = scanner.nextLine();

        // sprawdź i porównaj litery tekstu
        String[] literki = linia.split(""); // oddziel pojedynczo każdą literkę
        List<String> listaLiter = new ArrayList<>();

        // dodanie wszystkich elementów tablicy do listy
//        for (String litera : literki) {
//            listaLiter.add(litera);
//        }

        // alternatywa - dodaj wszystkie elementy innego zbioru (addAll)
        //                  Arrays.asList(literki) - stwórz zbiór liter z tablicy
        listaLiter.addAll(Arrays.asList(literki));

        Set<String> zbiorLiter = new HashSet<>(listaLiter);

        // jak sprawdzić, czy we wpisanym tekście znajdują się duplikaty (liter!)
        // AlaMuKot
        // alaMuKot
        boolean zawieraDuplikaty = zbiorLiter.size() != listaLiter.size();
        System.out.println("Zawiera duplikaty: " + zawieraDuplikaty + " kolekcja: " + zbiorLiter + " lista: " + listaLiter);
    }
}
