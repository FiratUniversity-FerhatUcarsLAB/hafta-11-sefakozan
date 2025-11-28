public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * e^-x + karekok(1 - e^-x) islemini yapan metod
    public static double expSum(double x) {
        // Math.exp(x) e^x hesaplar (e ≈ 2.71828)
        return x * Math.exp(-x) + Math.sqrt((1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        // TODO: test methods
        System.out.printf("multadd: %f\n", multadd(1.0, 2.0, 3.0));
        System.out.printf("expSum: %f\n", expSum(3));

        double a = Math.sin(Math.PI/4) + Math.cos(Math.PI/4) / 2;
        // Math.log(), dogal log hesaplar
        double b = Math.log(10) + Math.log(20);
        double c = Math.exp(Math.log(10));

        System.out.println("sin(pi/4) + cos(pi/4) / 2 = " + a);
        System.out.println("ln10 + ln20 = " + b);
        System.out.println("e^ln10 = " + c);
    }
}
