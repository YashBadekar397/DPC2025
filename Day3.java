import java.util.Arrays;

public class Day3 {

    private static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0) {
                return index;//duplicate found
            } else {
                arr[index] = -arr[index];//mark as visited!
            }


        }
        return 0;
    }





        public static void main (String[]args)
        {
            int[] arr = {3, 1, 3, 4, 2};
            System.out.println("Original Array:" + Arrays.toString(arr));
            int dup = findDuplicate(arr);
            System.out.println("Duplicate Number:" + dup);
        }


    }

