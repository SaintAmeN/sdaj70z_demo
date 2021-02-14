package pl.sda.javapol70.demo.files;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author amen
 * @Created 14.02.2021 11:01
 * @Project demo_javapol70
 */
public class MainResources {
    public static void main(String[] args) {
        InputStream inputStream = MainResources.class.getResourceAsStream("/ustawienia.properties");
        if(inputStream != null){ // jest taki plik
            Properties properties = new Properties();

            try {
                properties.load(inputStream);
            } catch (IOException e) {
                System.err.println("Problem z ładowaniem pliku.");
            }

            String wartosc = properties.getProperty("to.jest.jakies.ustawienie");
            if(wartosc != null){
                System.out.println("Wypisz: " + wartosc);
            }
        }else{
            System.err.println("Plik nie istnieje.");
        }
    }
}
