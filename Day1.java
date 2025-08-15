import java.util.Arrays;

public class Day1

{

//    Problem : Sort an Array of 0s, 1s, and 2s
//    You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.
//
//        Input :
//    An integer array arr of size n where each element is either 0, 1, or 2.
//    Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]
//
//    Output :
//    The sorted array, arranged in increasing order of 0s, 1s, and 2s.
//        Example: [0, 0, 0, 1, 1, 1, 2, 2]




    public static void sort012(int[] arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high)
        {
            if (arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;

            } else if (arr[mid]==1)
            {
                mid++;
            }
            else {
                int temp=arr[mid];
               arr[mid]=arr[high];
               arr[high]=temp;
               high--;
            }

        }
    }
 public static void main(String[] args) {
        int arr[]={0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Original Array:"+ Arrays.toString(arr));

        sort012(arr);
        System.out.println("Sorted Array:"+ Arrays.toString(arr));
    }



}


























  
