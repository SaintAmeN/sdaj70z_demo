package pl.sda.javapol70.demo.threads;

/**
 * @Author amen
 * @Created 31.01.2021 12:35
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        Krzykacz kA = new Krzykacz("AAA");
        Krzykacz kB = new Krzykacz("BBB");

//        Thread - wątek
//        Runnable target;

        Thread wątekKrzykacz1 = new Thread(kA);
        wątekKrzykacz1.run();

        wątekKrzykacz1.start();
        System.out.println("Stoję, czy wykonuję dalej instrukcje?");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread wątekKrzykacz2 = new Thread(kB);
        wątekKrzykacz2.start();
        System.out.println("Ok, lecę do domu panowie, miłej pracy.");
    }
}
