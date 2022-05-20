public class Lesson2 {
    int x = 10;
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        b = 10;
        b = (byte) (b * b);





        /*
        int d = 0, x = 10;
        if ( (d != 0) && (d > 10) ) {
            int sum;
            sum = x / 10;
            System.out.println(sum);
        }

        Five.main();
        Ten.main();

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
        =============
        int z;
        z = 4;
        z &= 5;
        z = z & 5;
        =============
        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);
        =============
        Four.main();
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


// Упражнения

class Four {
    public static void main() {
        String x = "One", y = "Two", z = "Three";
        System.out.println(x + " " + y + " " + z);
    }
}


class Five {
    public static void main() {
        int i;
        for (i = 0; i < 10; i++) {
            int sum = 0;

            sum = sum + i;

            System.out.println("Sum: " + sum);
        }
    }
}


class Ten {
    public static void main() {
        int i,j;
        boolean isprime;
        for (i = 2; i < 100; i++) {
            isprime = true;
            for (j = 2; j < i; j++)
                if ((i%j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - is a prime number.");
        }
    }
}