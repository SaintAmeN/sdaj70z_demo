package pl.sda.javapol70.demo.zbiory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 13.02.2021 09:58
 * @Project demo_javapol70
 */
public class Benchmark {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>(9000000);
        LinkedList<Integer> list = new LinkedList<>();

        dodaj(list, 100000);

        Runtime.getRuntime().gc();
        for (int i = 0; i < 7; i++) {
            Long nanoTimeStart = System.currentTimeMillis();

//            dodaj(list, 1000000);
//            dodajNaKoniec(list, 1000000);
            petlaGet(list);

            Long nanoTimeStop = System.currentTimeMillis();
            System.out.println("Czas wykonania = "+ (nanoTimeStop - nanoTimeStart) + " ms");
            Runtime.getRuntime().gc();
//            usun(list, 1000000);
            scanner.nextLine();
        }
    }

    public static void dodaj(List<Integer> list, int iloscDodanychElementow){
        for (int i = 0; i < iloscDodanychElementow; i++) {
            list.add(i);
        }
    }

    public static void dodajNaKoniec(LinkedList<Integer> list, int iloscDodanychElementow){
        for (int i = 0; i < iloscDodanychElementow; i++) {
            list.addLast(i);
        }
    }

    public static void usun(List<Integer> list, int iloscUsuwanychElementow){
        for (int i = 0; i < iloscUsuwanychElementow; i++) {
            list.remove(list.size()-1);
        }
    }

    public static void petlaGet(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int zmienna = list.get(i);              // array = (t)(1), linked = O(n)
//            zmienna++;
        }
    }

}
