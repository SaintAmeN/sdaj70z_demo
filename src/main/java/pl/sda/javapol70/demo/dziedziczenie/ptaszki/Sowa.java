package pl.sda.javapol70.demo.dziedziczenie.ptaszki;

/**
 * @Author amen
 * @Created 23.01.2021 09:40
 * @Project demo_javapol70
 */
public class Sowa implements Ptak {
    @Override
    public void spiewaj() {
        System.out.println("hu hu");
    }

    public void poluj(){
        System.out.println("Fruuuuu... lece na myszy");
    }

    private void cosInnego(){
        System.out.println("Fruuuuu... lece na myszy");
    }
}
