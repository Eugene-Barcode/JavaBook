public class Lesson3 {
    public static void main(String[] args)
            throws java.io.IOException {
                Shrek.main();
            /*
            char ch;

            System.out.print("Press the button and then press \"ENTER\": ");

            ch = (char) System.in.read();

            System.out.println("You pressed the button " + ch);


            */
    }
}


class Shrek {
    public static void main()
        throws java.io.IOException {
        char ch, answer = 'k';
        System.out.println("Try your luck, enter the character A-Z: ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("You are right! The letter is " + answer);
        }
        else {
            System.out.println("Symbol is incorrect, try again.");
        }
    }
}