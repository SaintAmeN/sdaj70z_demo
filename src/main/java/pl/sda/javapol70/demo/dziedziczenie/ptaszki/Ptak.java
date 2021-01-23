package pl.sda.javapol70.demo.dziedziczenie.ptaszki;

/**
 * @Author amen
 * @Created 23.01.2021 09:39
 * @Project demo_javapol70
 */
public interface Ptak {
    default void spiewaj(){
        System.out.println("Papidipupi");
    }


    // 1. w zależności od obiektu na którym wywołamy metodę, zachowanie będzie inne (zachowanie jest uzależnione od referencji obiektu którą posiadamy)
    // 2. zachowanie uzależnione od parametrów

}
