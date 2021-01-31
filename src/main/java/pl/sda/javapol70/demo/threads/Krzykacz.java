package pl.sda.javapol70.demo.threads;

/**
 * @Author amen
 * @Created 31.01.2021 12:35
 * @Project demo_javapol70
 */

/**
 * Obiekty tego typu będą krzyczeć "AAA!"
 */
public class Krzykacz implements Runnable{
    private String krzyk;
    private boolean mamKrzyczec;

    public Krzykacz(String krzyk) {
        this.krzyk = krzyk;
        this.mamKrzyczec = true;
    }

    public void krzycz() {
        System.out.println(System.currentTimeMillis() + " - " + krzyk + "!");
    }

    @Override
    public void run() {
        while (mamKrzyczec()){
            krzycz();
            // instrukcja usypiania.
            // chcemy, żeby wątek zrobił przerwę 1s pomiędzy kolejnymi krzykami.
            // 3.4 GHz - 3 400 000 000
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // brak obsługi, nic nie zrobimy. po prostu ktoś go wybudził.
            }
        }
    }

    private boolean mamKrzyczec() {
        return mamKrzyczec;
    }

    public void przestanKrzyczec(){
        this.mamKrzyczec = false;
    }
}
