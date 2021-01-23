package pl.sda.javapol70.demo.zbiory.set;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @Author amen
 * @Created 23.01.2021 10:48
 * @Project demo_javapol70
 */
@Getter
@Setter
public class Obywatel implements IPosiadaWage {
    private String imie;
    private String nazwisko;
    private int waga;

    public Obywatel(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Obywatel(String imie, String nazwisko, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
    }

    public void zaspiewajSwojHymn() {
        System.out.println("Parararira ram pam pam");
    }

    // Equals and hash code mają niepisany kontrakt
    // hashcode - unikalna wartość generowana na podstawie zawartości obiektu
    //  teoretycznie z uwagi na ograniczony zakres wartości, metoda equals może zwrócić ten sam wynik dla dwóch różnych obiektów
    //  hashcode - jeśli nie jest nadpisany to zwraca adres obiektu
    // equals - porównuje obiekty

    // wartość liczbowa(hashcode) jest obliczana na podstawie pól / treści
    // equals porównuje treść obiektu

    // !!!! zanim nadpiszemy metody, to hashcode - zwraca liczbę - miejsce w pamięci/referencję - equals porównuje referencję

    // kurs -> 2394857234908572439

    // chcę żeby obiekty były porównywane na podstawie wartości pól!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return Objects.equals(imie, obywatel.imie) &&
                Objects.equals(nazwisko, obywatel.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    public static void main(String[] args) {
        BazaDanych bd = new BazaDanych();

        Obywatel o1 = new Obywatel("Kursant", "Javy");
        Obywatel o2 = new Obywatel("Kursant", "Javy");

        System.out.println(o1.hashCode() + " " + o2.hashCode());
        System.out.println(o1.equals(o2)); // true

        List<Obywatel> obywatelList = bd.pobierzObywateli(); // new ArrayList(), new LinkedList

        // set posiada zdolność usuwania duplikatów - set NIGDY nie posiada duplikatów
        Set<Obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(o1);
        obywatelSet.add(o2);

        System.out.println("Rozmiar kolekcji: " + obywatelSet.size());

        // EQUALS - zawsze zwróci poprawną wartość porównania obiektów
        //  jeśli obiekty są takie same, to ich hashcode musi być taki sam
        //
        // HASHCODE - wartość na podstawie treści - mamy metodę hashującą treści -
        //  teoretycznie dwa różne obiekty mogą otrzymać ten sam hashcode (Long)
    }

    public void usunDuplikaty(List<Obywatel> lista) {
        for (Obywatel kogoPorownuje : lista) {
            for (Obywatel doKogo : lista) {
                if (kogoPorownuje.getImie().equals(doKogo.getImie()) &&
                        kogoPorownuje.getNazwisko().equals(doKogo.getNazwisko())) {
                    // imie i nazwisko są takie same
                }
            }
        }


    }

}
