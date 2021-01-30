package pl.sda.javapol70.demo.wyjatki.lapanie_jawny_niejawny;

import java.util.Random;

/**
 * @Author amen
 * @Created 30.01.2021 11:44
 * @Project demo_javapol70
 */
public class ManagerKursantow {
    public void dodajKursanta() throws JestemSobieWyjatekJawny {
        // ta funkcja nie jest obsługiwana
        // throw - rzuć ... throwable (Exception)
        // alt+enter -> surround with try_catch

//        Złap wyjątek w tym miejscu
//        try {
        //
        //

        throw new JestemSobieWyjatekJawny("Wyjatek.");
        //
        //
//        } catch (JestemSobieWyjatekJawny jestemSobieWyjatekJawny) {
//            jestemSobieWyjatekJawny.printStackTrace();
//        }
    }

    public void wymienNazwiska() {
        String tekst = null;
        if(new Random().nextBoolean()){
            tekst.length();
        }

        throw new CiiiJestemWyjatekNiejawny();
    }
}
