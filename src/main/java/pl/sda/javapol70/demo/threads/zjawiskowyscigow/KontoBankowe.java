package pl.sda.javapol70.demo.threads.zjawiskowyscigow;

/**
 * @Author amen
 * @Created 31.01.2021 13:38
 * @Project demo_javapol70
 */
public class KontoBankowe {
    private double saldo = 0.0;
    private final Object lock = new Object();

    // synchronized - tylko jeden wątek może wykonywać dany blok kodu
    public /*synchronized*/ void przelewWychodzacy(double kwota) {
        synchronized (lock){
            saldo = saldo - kwota;
        }
    }

    public /*synchronized*/ void przelewPrzychodzacy(double kwota) {
        synchronized (lock) {
            saldo = saldo + kwota;
        }
    }

    public void wypiszStanKonta() {
        System.out.println("Saldo: " + saldo);
    }
}
