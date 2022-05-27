public class Recursion {
    public static void main(String[] args) {
        int z = count(5);
        System.out.println(z);
        }
    public static int count(int n) {
        if (n == 1) {
        }
        else if (n == 2) {
        }
        else if (n == 3) {
        }
        else {
            return count(n - 1) + count(n - 2) + count(n - 3);
        }
        return n;
    }
        /*
        if (n == 0) {
            System.out.println(n);
            return 3;
        } else {
            System.out.println(n);
            return count(n - 1) + 5;
        } */

}