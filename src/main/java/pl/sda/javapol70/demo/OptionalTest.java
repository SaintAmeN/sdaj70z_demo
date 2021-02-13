package pl.sda.javapol70.demo;

import java.awt.*;
import java.util.Optional;

/**
 * @Author amen
 * @Created 13.02.2021 11:52
 * @Project demo_javapol70
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Integer> wartoscOptional = obliczDystans(new Point(0, 1), new Point(1,1));

        if(wartoscOptional.isPresent()) {
            Integer wartosc = wartoscOptional.get();

        }

    }

    // zerowy dystans gdy p1 == p2
    // dodatnia wartość gdy mamy dystans do pokonania
    // ujemna wartość oznacza konieczność zawrócenia itd.

    /**
     * Funkcja oblicz dystans zwraca dystans między punktami p1, p2.
     * @param p1
     * @param p2
     * @return jeśli wartość jest dostępna, to jest liczbą, jeśli nie, to nie
     */
    private static Optional<Integer> obliczDystans(Point p1, Point p2){
        return Optional.empty();
    }
}
