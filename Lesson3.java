public class Lesson3 {
    public static void main(String[] args)
            throws java.io.IOException {

            char ch;

            System.out.print("Press the button and then press \"ENTER\": ");

            ch = (char) System.in.read();

            System.out.println("You pressed the button " + ch);
    }
}
