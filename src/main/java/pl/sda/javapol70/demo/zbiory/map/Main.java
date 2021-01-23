package pl.sda.javapol70.demo.zbiory.map;

import pl.sda.javapol70.demo.zbiory.set.Obywatel;

import java.util.*;

/**
 * @Author amen
 * @Created 23.01.2021 13:54
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Obywatel> map = new HashMap<>(); // 00091111111

        Set<Map.Entry<String, Obywatel>> entrySet = map.entrySet(); // pobiera zbiór (par) wpisów // Entry

        Collection<Obywatel> obywatelSet = map.values();            // pobiera kolekcję (iterowalną) wartości (Obywatele)

        Set<String> klucze = map.keySet();                          // pobiera kolekcję kluczy (String)



    }
}
