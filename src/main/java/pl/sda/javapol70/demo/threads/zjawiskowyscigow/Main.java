package pl.sda.javapol70.demo.threads.zjawiskowyscigow;

import java.util.Scanner;

/**
 * @Author amen
 * @Created 31.01.2021 13:47
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                bank.wykonajPrzelewPrzychodzacyNaKwote(10);
            } else {
                bank.wykonajPrzelewWychodzacyNaKwote(10);
            }
        }

        // saldo =

        Scanner scanner = new Scanner(System.in);
        String linia = null;
        do {
            System.out.println("Jedziesz ziom, dawaj instrukcje: ");
            linia = scanner.nextLine();

            if (linia.startsWith("saldo")) {
                bank.printSaldo();
            }
        } while (!linia.equalsIgnoreCase("quit"));
    }
}
