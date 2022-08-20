public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
        boolean A = false;
        while (A = false) {
            if ((n * n * n + 71) % 47 != 0) {
                n = n + 1;
            }
            else if ((n * n * n + 71) % 47 == 0) {
                A = true;
                System.out.println(n);
            }
        }
    }
}

