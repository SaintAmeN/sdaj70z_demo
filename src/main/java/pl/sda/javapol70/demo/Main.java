package pl.sda.javapol70.demo;

/**
 * @Author amen
 * @Created 23.01.2021 09:22
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        String tekst = new String("txt");
        String cosInnego = new String("txt");

        System.out.println(tekst == cosInnego); // nowe miejsce w pamięci dla każdej zmiennej, ergo - dwa obiekty = false


    }
}
