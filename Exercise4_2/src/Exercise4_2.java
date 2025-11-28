/**
 * Ad Soyad: [Muhammet Sefa KOZAN]
 * Numara: [250541057]
 * Tarih: [28.11.2025]
 */

public class Exercise4_2 {
    /** Cikti
     * ik
     * rattle
     * ping zoop
     * boo-wa-ha-ha
     */

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void baffle(String blimp) { // ilk gonderilen parametre quince argumaninin "rattle" degeridir
        System.out.println(blimp); // 6
        zippo("ping", -5); // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 2, 8
            System.out.println(quince + " zoop"); // 9
        }
        else { // 3
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 10
        }
    }
}
