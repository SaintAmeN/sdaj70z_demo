package pl.sda.javapol70.demo.finaltest;


/**
 * @Author amen
 * @Created 31.01.2021 09:24
 * @Project zadania_zdalne_pl_70
 */
public /*final*/ class Klasa {
    // String = immutable
    // Ich treść nie może się zmienić.
    // Złożoność obliczeniowa łączenia string'ów przez + była n^2
    // StringBuilder

    // "Ala " + "ma " + "kota."

    /**
     * metoda finalna to metoda niezmienna (nie do nadpisania)
     */
    public final void metoda() {
        System.out.println("La la la");

        StringBuilder stringBuilder = new StringBuilder("Treść bazowa.\n");

        for (int i = 0; i < 5; i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". Hello World!\n");
        }

        String wynik = stringBuilder.toString();
        System.out.println("Wynikowy tekst:" + wynik);
    }

    public static void staticowaMetoda(){

    }
}
