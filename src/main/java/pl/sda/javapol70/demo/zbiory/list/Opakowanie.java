package pl.sda.javapol70.demo.zbiory.list;

import pl.sda.javapol70.demo.zbiory.set.IPosiadaWage;

/**
 * @Author amen
 * @Created 23.01.2021 13:01
 * @Project demo_javapol70
 */
public class Opakowanie<TL, TP> implements IPosiadaWage {
    private TL lewy;     // 'lewy obiekt'
    private TP prawy;    // 'prawy obiekt'

    public Opakowanie(TL lewy, TP prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public TL getLewy() {
        return lewy;
    }

    public void setLewy(TL lewy) {
        this.lewy = lewy;
    }

    public TP getPrawy() {
        return prawy;
    }

    public void setPrawy(TP prawy) {
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
