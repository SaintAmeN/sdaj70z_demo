package pl.sda.javapol70.demo.wyjatki.lapanie_jawny_niejawny;

/**
 * @Author amen
 * @Created 30.01.2021 11:44
 * @Project demo_javapol70
 */
public class CiiiJestemWyjatekNiejawny extends RuntimeException {
    public CiiiJestemWyjatekNiejawny() {
        super("Domyslna wiadomosc w przypadku tego wyjątku.");
    }
}
