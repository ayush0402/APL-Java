import java.util.Arrays;

public class SortMethod {
    private static void sortFun(int[] arr) throws Exception {
        if (arr.length != 10) {
            throw new Exception(
                    "The Array should contain exactly 10 elements\n");
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
            if (i == arr.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] shortArray = {20, 40, 60, 80};
        int[] Array = {100, 24, 255, 45, 98, 78, 3, 70, 777, 12};
        int[] longArray = {12, 35, 425, 462, 21, 34, 213, 5235, 123, 35, 36, 90, 124, 99, 87, 64};

        System.out.println("==========================================");

        try {
            System.out.println("Case 1: Size of array is less than 10");
            SortMethod.sortFun(shortArray);
        } catch (Exception error) {
            System.out.println(error);
        }
        try {
            System.out.println("==========================================");
            System.out.println("Case 2: Size of array 10");
            SortMethod.sortFun(Array);
        } catch (Exception error) {
            System.out.println(error);
        }
        try {
            System.out.println("==========================================");
            System.out.println("Case 3: Size of array is greater than 10");
            SortMethod.sortFun(longArray);
        } catch (Exception error) {
            System.out.println(error);
        }
        System.out.println("==========================================");
    }

}
