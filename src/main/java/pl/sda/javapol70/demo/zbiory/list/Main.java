package pl.sda.javapol70.demo.zbiory.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author amen
 * @Created 23.01.2021 12:29
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4); // wartość 4
        elements.add(5); // index 4
        elements.add(null);
        elements.add(null);
        elements.add(null);
        elements.add(null);
        elements.add(4);

        Integer liczba = null;
//        int liczbaInt = null;

        for (Integer elementListy : elements) { // wypisz - foreach - 1 linia tekstu na wyjściu
            System.out.print(elementListy);
            System.out.print(" ");
        }
        System.out.println(); // dodaj enter(przejście do nowej linii)

        // size = rozmiar
        for (int i = 0; i < elements.size(); i++) {
            Integer elementListy = elements.get(i); // pobranie elementu z listy możliwe jest za pomocą metody get();

            System.out.print(elementListy);
            System.out.print(" ");
        }
        System.out.println(); //  dodaj enter(przejście do nowej linii)
        elements.remove(4);

        System.out.println(elements);
    }
}
