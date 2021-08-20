public class PentagonalNumbers {
    public static void main(String[] args) {
        System.out.println("The first 50 Pentagonal Numbers are : ");

        for (int i = 1; i <= 50; i++) {
            int num = (i * (3 * i - 1)) / 2;
            System.out.print(num + " ");
        }

    }
}
