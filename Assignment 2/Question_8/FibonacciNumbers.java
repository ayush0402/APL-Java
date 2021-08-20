public class FibonacciNumbers {

    public static void main(String[] args) {
        int last = 0;
        int current = 1;

        System.out.print(last + " ");

        for (int i = 0; i < 100; i++) {
            if (current > 100) break;
            System.out.print(current + " ");
            int temp = current;
            current = last + current;
            last = temp;
        }
    }
}

