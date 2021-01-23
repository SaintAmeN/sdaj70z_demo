package pl.sda.javapol70.demo.dziedziczenie.pkgoddzielny;

import pl.sda.javapol70.demo.dziedziczenie.pkgglowny.KlasaNadrzedna;

/**
 * @Author amen
 * @Created 23.01.2021 09:27
 * @Project demo_javapol70
 */
public class InnaKlasaDzedziczaca extends KlasaNadrzedna {
    public InnaKlasaDzedziczaca() {
    }
    public void test(){
        super.metodaFinalna();
    }
}
