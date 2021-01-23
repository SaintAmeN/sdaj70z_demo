package pl.sda.javapol70.demo.zbiory.list;

import pl.sda.javapol70.demo.zbiory.set.IPosiadaWage;
import pl.sda.javapol70.demo.zbiory.set.Obywatel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author amen
 * @Created 23.01.2021 12:51
 * @Project demo_javapol70
 */
public class MainListaObywateli {
    public static void main(String[] args) {
        List<Obywatel> list = new ArrayList<>();

        Opakowanie<Obywatel, Obywatel> obywatelOpakowanie = new Opakowanie<>(
                new Obywatel("Pawel", "Gawel", 50),
                new Obywatel("Pawel", "Rafeł", 80)
        );

        Obywatel pawel1 = new Obywatel("Pawel", "Gawel", 50);
        Obywatel zosia = new Obywatel("Zosia", "Gawel", 50);
        Opakowanie<Obywatel, Integer> obywatelZLiczbą = new Opakowanie<>(
                pawel1,
                20
        );
        int liczba = obywatelZLiczbą.getPrawy();

        int sumaWagi = sumujWage(pawel1, zosia, obywatelOpakowanie);
        System.out.println("Suma wag: " + sumaWagi);
    }

    public static <T> Long sumujHashCody(List<T> liczby) {
        Long suma = 0L;
        for (T t : liczby) {
            suma += t.hashCode();
        }
        return suma;
    }

    // wymuszamy aby obiekty T (podstawione przy wykonaniu) dziedziczyły/implementowały dany typ
    public static <T extends IPosiadaWage> int sumujWage(T... obiekty) {
        int suma = 0;
        for (T t : obiekty) {
            suma += t.getWaga();
        }
        return suma;
    }
}
