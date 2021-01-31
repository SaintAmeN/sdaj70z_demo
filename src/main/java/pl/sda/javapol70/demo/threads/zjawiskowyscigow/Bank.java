package pl.sda.javapol70.demo.threads.zjawiskowyscigow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author amen
 * @Created 31.01.2021 13:37
 * @Project demo_javapol70
 */
public class Bank {
    private final KontoBankowe kontoBankowe = new KontoBankowe();
    private final ExecutorService wykonawcaPrzelewow = Executors.newFixedThreadPool(4);


    public void wykonajPrzelewWychodzacyNaKwote(double kwota) {
        wykonawcaPrzelewow.submit(new Przelew(kwota, KierunekPrzelewu.WYCHODZACY, kontoBankowe));
    }

    public void wykonajPrzelewPrzychodzacyNaKwote(double kwota) {
        wykonawcaPrzelewow.submit(new Przelew(kwota, KierunekPrzelewu.PRZYCHODZACY, kontoBankowe));
    }

    public void printSaldo() {
        kontoBankowe.wypiszStanKonta();
    }
}
