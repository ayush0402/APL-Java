public class DivisionMethod {
    private static void divideFun(int[] arr, int divisor) throws Exception {

        if (divisor == 0) {
            throw new ArithmeticException("Number can't be divided by Zero.\n");
        } else if (arr.length != 15) {
            throw new IllegalArgumentException(
                    "The Array should contain exactly 15 elements\n");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((double) arr[i] / divisor + " ");

            if (i == arr.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] incorrectSize = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] correctSize = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("================================================");
        try {
            System.out.println("Case 1 : Wrong Array size.");
            DivisionMethod.divideFun(incorrectSize, 2);
        } catch (Exception error) {
            System.out.println(error);
        }
        try {
            System.out.println("================================================");
            System.out.println("Case 2 : Correct Array size.");
            DivisionMethod.divideFun(correctSize, 5);
        } catch (Exception error) {
            System.out.println(error);
        }
        try {
            System.out.println("================================================");
            System.out.println("Case 3 : Divisor is Zero.");
            DivisionMethod.divideFun(correctSize, 0);
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println("================================================");
    }
}
