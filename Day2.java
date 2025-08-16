public class Day2 {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;  // expected total elements
        int total = n * (n + 1) / 2;  // sum of first n natural numbers
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Missing number: " + findMissingNumber(arr1));
    }
}
