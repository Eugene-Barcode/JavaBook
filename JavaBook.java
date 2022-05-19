public class JavaBook {
    public static void main(String[] args) {



        /*
        char ch = 'X';
        System.out.println(ch);
        ch++;
        System.out.println(ch);
        ch = 90;
        System.out.println(ch);

        ==============

        double gravitation_on_the_Moon = 0.17;
        double yourWeight = 70;
        double MoonWeight;
        MoonWeight = yourWeight * gravitation_on_the_Moon;
        System.out.println(MoonWeight + " kilos");

        ================

        int count;
        for (count = 0; count < 5; count++)
            System.out.println(count);
        System.out.println("Ready!");

        ================

        int var1;
        int var2;
        var1 = 1024;
        System.out.println("Пременная var1 содержит " + var1);
        var2 = var1 / 2;
        System.out.println("Переменная var2 содержит var1 / 2:");
        System.out.println(var2);

        ================

        double x;
        float y;
        x = 2.75;
        y = 5.50F;
        System.out.println(var1 / y);
        System.out.println(var1 / x);
         */

    }
}

class InchesToMeters {
    public static void main() {
        double inches, meters;
        int counter;
        counter = 0;
        for (meters = 1; meters < 30; meters++) {
            inches = meters * 39.37;
            System.out.println(meters + " meter equals " + inches + " inches.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

