public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        /** Cevap
         * Kod derlenir ve calisir, bir hata vermez.
         * Cunku sonucu kullanmamak teknik olarak gecerli bir davranistir. Sadece gereksiz islem yapilir.
         *
         * Uyari mesaji: Result of 'Exercise4_4.getNumber()' is ignored
         */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        /** Cevap
         * ERROR mesaji: Operator '+' cannot be applied to 'void', 'int'
         *
         * + operatoru iki degerin birlestirilmesini bekler.
         * Ama void “geri donus degeri yok” demektir.
         * Donus degeri olmayan bir metod ile int toplanilmaya calisilirsa hata verilecektir.
         *
         ** Dogru Kullanim Ornekleri
         * sayHello();                         -> dogru – statement olarak
         * System.out.println("boo!");         -> dogru
         * String s = "Sonuc: " + 7;           -> dogru
         *
         ** Yanlis Kullanim Ornekleri
         * sayHello() + 5;                     -> hata
         * "merhaba" + sayHello();             -> hata
         * int x = 5 + sayHello();             -> hata
         * if (sayHello()) { }                 -> hata
         */

        /** NOT
         *** Expression (Ifade)
         * Bir deger uretir (int, String, boolean vs.)
         * 5 + 3 -> 8
         * x > 10 -> true
         * Math.abs(-7) -> 7
         *
         *** Statement (Deyim)
         * Bir sey yapar, ama zorunlu olarak deger uretmez
         * System.out.println("merhaba");
         * int x = 5;
         * if (…) { … }
         */

    }
}
