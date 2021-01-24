package pl.sda.javapol70.demo.czas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 11:09
 * @Project demo_javapol70
 */
public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Long currentTime = System.currentTimeMillis(); // timestamp
        System.out.println("Current timestamp:" + currentTime);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę:");
        String dataOdUzytkownika1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(dataOdUzytkownika1, formatter);

        System.out.println("Podaj datę:");
        String dataOdUzytkownika2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(dataOdUzytkownika2, formatter);

        if (date1.isAfter(date2)) {
            System.out.println("Która data jest wcześniejsza: " + date2);
        } else {
            System.out.println("Która data jest wcześniejsza: " + date1);
        }
    }
}

