package pl.sda.javapol70.demo.zbiory.list;

import pl.sda.javapol70.demo.zbiory.set.IPosiadaWage;
import pl.sda.javapol70.demo.zbiory.set.Obywatel;

/**
 * @Author amen
 * @Created 23.01.2021 13:01
 * @Project demo_javapol70
 */
public class OpakowanieObywatelObywatel implements IPosiadaWage {
    private Obywatel lewy;     // 'lewy obiekt'
    private Obywatel prawy;    // 'prawy obiekt'

    public OpakowanieObywatelObywatel(Obywatel lewy, Obywatel prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public Obywatel geObywatelewy() {
        return lewy;
    }

    public void seObywatelewy(Obywatel lewy) {
        this.lewy = lewy;
    }

    public Obywatel geObywatelrawy() {
        return prawy;
    }

    public void seObywatelrawy(Obywatel prawy) {
        this.prawy = prawy;
    }

    @Override
    public int getWaga() {
        int suma = 0;
        // sprawdzamy czy prawy jest typu IPosiadaWage
        if (prawy instanceof IPosiadaWage) {
            IPosiadaWage prawyRzutowany = (IPosiadaWage) prawy;
            suma += prawyRzutowany.getWaga();
        }
        // Sprawdzamy czy lewy jest typu IPosiadaWage
        if (lewy instanceof IPosiadaWage) {
            IPosiadaWage lewyRzutowany = (IPosiadaWage) lewy;
            suma += lewyRzutowany.getWaga();
        }
        return suma;
    }
}
