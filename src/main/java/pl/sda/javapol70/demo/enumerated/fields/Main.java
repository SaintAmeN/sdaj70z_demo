package pl.sda.javapol70.demo.enumerated.fields;

/**
 * @Author amen
 * @Created 30.01.2021 11:14
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        WielkoscMonitora wielkoscMonitora = WielkoscMonitora.INCH_23;

        WielkoscMonitora wielkosc_2 = WielkoscMonitora.valueOf("INCH_23"); // Zamień tekst na obiekt enum

        System.out.println(wielkosc_2 == wielkoscMonitora);

        System.out.println("Wielkość wyrażona w centrymetrach: " + wielkosc_2.getRozmiarWCentymetrach());
    }
}
