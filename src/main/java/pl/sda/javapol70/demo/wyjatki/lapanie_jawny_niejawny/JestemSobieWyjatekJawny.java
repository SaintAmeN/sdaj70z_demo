package pl.sda.javapol70.demo.wyjatki.lapanie_jawny_niejawny;

/**
 * @Author amen
 * @Created 30.01.2021 11:43
 * @Project demo_javapol70
 */
// Żeby wyjątek był wyjątkiem, musi rozszerzać Exception (jawny) lub...
public class JestemSobieWyjatekJawny extends Exception{
    // todo: zapytać o kolejność wywołania konstruktorów i instrukcji.
    // todo: pogadać trochę o 'super'
    public JestemSobieWyjatekJawny(String message) {
        super(message);
    }
}
