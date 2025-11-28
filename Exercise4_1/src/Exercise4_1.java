/**
 * Ad Soyad: [Muhammet Sefa KOZAN]
 * Numara: [250541057]
 * Tarih: [28.11.2025]
 */

public class Exercise4_1 {

    public static void printAmerican(String day, String month, int date, int year) {
        // Monday, July 22, 2019
        System.out.printf("%s, %s %d, %d\n", day, month, date, year);
    }

    public static void printEuropean(int date, String month, int year, String day) {
        // 22 July 2019, Monday
        System.out.printf("%d %s %d, %s\n", date, month, year, day);
    }

    public static void main(String[] args) {
        // TODO: test methods
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, month, date, year);
        printEuropean(date, month, year, day);
    }
}
