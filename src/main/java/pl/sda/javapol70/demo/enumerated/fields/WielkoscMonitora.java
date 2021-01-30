package pl.sda.javapol70.demo.enumerated.fields;

/**
 * @Author amen
 * @Created 30.01.2021 11:09
 * @Project demo_javapol70
 */
//todo:  zastosowanie wzorzec projektowy - singleton
public enum WielkoscMonitora {
    // model super hiper uproszczony

    // zdefiniowanie wszystkich dostępnych opcji - użycie konstruktorów w celu stworzenia instancji/enumów
    INCH_23(58.42),
    INCH_24(60.96),
    INCH_25(63.5);

    private double rozmiarWCentymetrach;

    WielkoscMonitora(double rozmiarWCentymetrach) {
        this.rozmiarWCentymetrach = rozmiarWCentymetrach;
    }

    public double getRozmiarWCentymetrach() {
        return rozmiarWCentymetrach;
    }
}
