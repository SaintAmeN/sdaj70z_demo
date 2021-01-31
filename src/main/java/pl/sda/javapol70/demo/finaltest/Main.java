package pl.sda.javapol70.demo.finaltest;

/**
 * @Author amen
 * @Created 31.01.2021 09:24
 * @Project zadania_zdalne_pl_70
 */
public class Main {
    public static void main(String[] args) {
        Klasa k = new Klasa();
        k.metoda();

        System.out.println(k);

        String str1 = new String("common_prefixCa");
        String str2 = new String("common_prefixDB");

        // Porównanie treści (zawartości string):
        System.out.println("Porównanie: " + (str1.equals(str2)));   // false

        // ==
        System.out.println("Str1 hc: " + str1.hashCode()); // hashcode w str. generuje się na podstawie liter w treści
        System.out.println("Str2 hc: " + str2.hashCode());
        //            [ ] [ ] [ ] [ ] [ ] [ ]

        Obywatel o1 = new Obywatel(str1);
        Obywatel o2 = new Obywatel(str2);

        System.out.println("Porównanie: " + o1.equals(o2)); // nie nadpisałem - > miejsce w pam.
        System.out.println("Porównanie: " + (o1 == o2));    // miejsce w pamięci

        System.out.println("Porównanie hashcode o1: " + (o1.hashCode()));
        System.out.println("Porównanie hashcode o2: " + (o2.hashCode()));
        System.out.println("Porównanie hashcode: " + (o2.hashCode() == o2.hashCode()));




    }
}
