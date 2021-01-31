package pl.sda.javapol70.demo.threads.przykladExecutor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author amen
 * @Created 31.01.2021 13:21
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        // 20 ms
        // 10 s
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // dużo małych zadań.
        //  - posiada kolejkę zadań.

        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("A!");
            }
        };

        Runnable psik = new Runnable() {
            @Override
            public void run() {
                System.out.println("Psik");
            }
        };

        Runnable naZdrowie = new Runnable() {
            @Override
            public void run() {
                System.out.println("Na zdrowie!");
            }
        };

        System.out.println("Rozpoczynam dodawanie zadań.");
        for (int i = 0; i < 100000; i++) {
            int losowa = new Random().nextInt(3);
            if(losowa == 0){
                executorService.submit(a);
            } else if(losowa == 1){
                executorService.submit(psik);
            } else if(losowa == 2){
                executorService.submit(naZdrowie);
            }
        }
        System.out.println("Koniec dodawania zadań.");
    }
}
