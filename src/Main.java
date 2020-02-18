public class Main {

    public static void main(String[] args) {

        printMultiplyUpToTen(2);

    }

    static int printMultiplyUpToTen(int n) {

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.printf("%d x %d = %d", n, i, result);
            System.out.println();

        }
        return 0;
    }

}
