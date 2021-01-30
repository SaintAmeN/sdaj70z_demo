package pl.sda.javapol70.demo.wyjatki.lapanie_jawny_niejawny;

/**
 * @Author amen
 * @Created 30.01.2021 11:43
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        ManagerKursantow managerKursantow = new ManagerKursantow();

        // wyjątek jawny
        try {
            System.out.println("Bum, rozpoczynamy wykonanie.");
            managerKursantow.dodajKursanta();
            System.out.println("Nic się nie zadziało");
        } catch (JestemSobieWyjatekJawny jestemSobieWyjatekJawny) {
            System.out.println("Wyjątek jawny przechwycony.");
//            jestemSobieWyjatekJawny.printStackTrace();
        }


        try {
            managerKursantow.wymienNazwiska();
        } catch (CiiiJestemWyjatekNiejawny cii) {
            System.out.println(cii);
        } catch (NullPointerException npe) { // nigdy nie widziałem żeby ktoś tak zrobił
            System.out.println("Null:" + npe);
        }

        instrukcja(10000);

    }

    // Pamięć
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    // Main -> I10 -> I9 -> I8 -> I7 -> I6 -> I5 -> I4 -> I3 -> I2 -> I1 -> I0
    // Main <- I10 <- I9 <- I8 <- I7 <- I6 <- I5 <- I4 <- I3 <- I2 <- Z1 <- Z0
    public static void instrukcja(int ileJeszcze) {
        //
        System.out.println("Jeszcze.");
        if (ileJeszcze > 0) {
            instrukcja(ileJeszcze - 1);
        }
        System.out.println("Mniam! Zjadam " + ileJeszcze);
    }
}
