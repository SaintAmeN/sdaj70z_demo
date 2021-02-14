package pl.sda.javapol70.demo.reflect;

import pl.sda.javapol70.demo.dziedziczenie.ptaszki.Sowa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author amen
 * @Created 14.02.2021 09:35
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        Sowa sowa = new Sowa();

        Method[] methods = sowa.getClass().getDeclaredMethods();
        System.out.println("Metody: " + Arrays.toString(methods));

        System.out.println();
        sowa.spiewaj();
        System.out.println();

        System.out.println("Metoda ktora uprywatniam: " + methods[1]) ;
        System.out.println("Metoda ktora uprywatniam: " + methods[0]) ;
        System.out.println("Metoda ktora uprywatniam: " + methods[2]) ;

        try {
            System.out.println("x");
            methods[2].invoke(sowa);
            System.out.println("x");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        sowa.getClass().getDeclaredMethods()[2].setAccessible(true);
        try {
            System.out.println("y");
            methods[2].invoke(sowa);
            System.out.println("y");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
