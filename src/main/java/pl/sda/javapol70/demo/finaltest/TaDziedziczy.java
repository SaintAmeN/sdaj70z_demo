package pl.sda.javapol70.demo.finaltest;

/**
 * @Author amen
 * @Created 31.01.2021 09:24
 * @Project zadania_zdalne_pl_70
 */
public class TaDziedziczy extends Klasa{

    private final int imie;  // pole o wartości niezmiennej
    private String nazwisko;

    public TaDziedziczy(int imie) {
        this.imie = imie;
//        Klasa.staticowaMetoda();
    }

    public TaDziedziczy(int imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void metoda(String cost){
        System.out.println("Coś lala la innego");
    }
}
