package pl.sda.javapol70.demo.threads.zjawiskowyscigow;

/**
 * @Author amen
 * @Created 31.01.2021 13:41
 * @Project demo_javapol70
 */
public class Przelew implements Runnable{
    private double kwota;
    private KierunekPrzelewu kierunekPrzelewu;
    private KontoBankowe kontoBankowe;

    public Przelew(double kwota, KierunekPrzelewu kierunekPrzelewu, KontoBankowe kontoBankowe) {
        this.kwota = kwota;
        this.kierunekPrzelewu = kierunekPrzelewu;
        this.kontoBankowe = kontoBankowe;
    }

    @Override
    public void run() {
        if(kierunekPrzelewu == KierunekPrzelewu.PRZYCHODZACY){
            kontoBankowe.przelewPrzychodzacy(kwota);
        } else if(kierunekPrzelewu == KierunekPrzelewu.WYCHODZACY){
            kontoBankowe.przelewWychodzacy(kwota);
        }
    }
}
