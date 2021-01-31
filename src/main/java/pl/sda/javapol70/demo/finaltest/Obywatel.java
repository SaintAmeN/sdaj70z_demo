package pl.sda.javapol70.demo.finaltest;

import java.util.Objects;

/**
 * @Author amen
 * @Created 31.01.2021 10:23
 * @Project zadania_zdalne_pl_70
 */
public class Obywatel {
    private String imie;

    public Obywatel(String obywatel) {
        this.imie = obywatel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return Objects.equals(imie, obywatel.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
