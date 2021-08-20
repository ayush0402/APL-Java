public class TwinPrime {

    public static boolean isPrime(int n) {

        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i) && isPrime(i - 2) && !isPrime(i - 1)) {
                System.out.println("(" + (i - 2) + "," + (i) + ")");
            }
        }
    }

}
