import java.util.*;


//Problem : Find All Subarrays with Zero Sum
//You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero.
// A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.
//
//Input :
//An integer array arr of size n where n represents the number of elements in the array.
//Example :
//Input: [1, 2, -3, 3, -1, 2]
//
//Output :
//        - Return a list of tuples, where each tuple contains two integers. The starting index (0-based) of the subarray.
//        The ending index (0-based) of the subarray.
//        - The output should list all subarrays that sum to zero. If no such subarrays are found, return an empty list.
//        Example
//Output: [(0, 2), (1, 3)]
















public class Day6 {
    public static List<int[]> subarraySum(int[] nums, int k) {
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // map: prefixSum -> list of indices where this sum occurs
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1))); // prefix sum 0 at index -1

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If (sum - k) exists, we found subarray(s)
            if (map.containsKey(sum - k)) {
                for (int startIndex : map.get(sum - k)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            // Add current prefix sum to map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> res = subarraySum(arr, 0);  // here k = 0

        // Print in tuple list style: [(0, 2), (1, 3)]
        System.out.print("[");
        for (int i = 0; i < res.size(); i++) {
            int[] range = res.get(i);
            System.out.print("(" + range[0] + ", " + range[1] + ")");
            if (i != res.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
