/**
 * Ad Soyad: [Muhammet Sefa KOZAN]
 * Numara: [250541057]
 * Tarih: [28.11.2025]
 */

public class Exercise4_5 {

    /**
     * main baslar: bizz = 5, buzz = 2 atamalari yapilir
     * zoop("just for", 5) cagrilir
     * "just for" yazdirilir
     * bob == 5 true oldugu icin ping("not ") çagrilir
     * ping metodu "any not more " yazdirir
     * clink(4) cagrilir
     * "It's " yazdirilir (print)
     * zoop("breakfast ", 4) cagrilir
     * "breakfast " yazdirilir
     * bob == 5 false oldugu icin else blogu calisir
     * "!" yazdirilir
     */

    /** Cikti
     * just for
     * any not more
     * It's breakfast
     * !
     */

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
