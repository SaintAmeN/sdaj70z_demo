package pl.sda.javapol70.demo.dziedziczenie.ptaszki;

/**
 * @Author amen
 * @Created 23.01.2021 09:56
 * @Project demo_javapol70
 */
public class Gołąb implements Ptak {
    public void spiewaj(){
        System.out.println("gu gu");
    }

    public void spiewaj(String coMamSpiewac){
        System.out.println("Spiewam: " + coMamSpiewac);
    }

    public void spiewaj(int coMamSpiewac){
        System.out.println("Spiewam kawałek numer: " + coMamSpiewac);
    }
}
