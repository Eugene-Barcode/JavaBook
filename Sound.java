public class Sound {
    int x = 10;
    public static void main(String[] args) {
        double range, seconds, speedoflight, echo;
        seconds = 7.2;
        speedoflight = 1100;
        range = seconds * speedoflight;
        System.out.println("The range is: " + range + " feet.");
        echo = (seconds / 2) * speedoflight;
        System.out.println("Echo range is: " + echo);
        int x, y;
        y = 10;
        x = y++;
        System.out.println(x);
        System.out.println(y);
        ScopeDemo.main();
        SCops.main();

        int z;
        z = 4;
        z &= 5;
        z = z & 5;

        /*
        char tab;
        tab = '\t';
        System.out.println(tab);
        char k = 'k';
        int a, b = 16, c = 19, d;
        a = 15;
        d = 25;
        System.out.println();
         */
    }
}


class Car {
    public static void main() {
        int x = 10, count;
        if (5 < x) {
            System.out.println(x);
            x++;
            System.out.println(x);
            x = 15;
        }
        for (count = 0; x < 20; x++) {
            System.out.println(x);
        }
    }
}


class ScopeDemo {
    public static void main() {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println(x + " " + y);
        }
        /*
        y = 100; Вложенная область не видна для внешней, но x будет виден
         */
        System.out.println(x);
    }
}


class SCops {
    public static void main() {
        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0 ) {
            System.out.println(d + " is a divider for " + n);
        }

        d = 0;

        if (d != 0 && (n % d) == 0 ) {
            System.out.println(d + " is a divider for " + n);
        }
        /*
        if (d != 0 & (n % d) == 0 ) {
            System.out.println(d + " is a divider for " + n); Ошибка деления на 0
        }

         */
    }
}