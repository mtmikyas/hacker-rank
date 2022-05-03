package interviewprep.arrays;

/**
 * ou are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
 * <p>
 * Example
 * <p>
 * <p>
 * Perform the following steps:
 * <p>
 * i   arr                         swap (indices)
 * 0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
 * 1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
 * 2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
 * 3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
 * 4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
 * 5   [1, 2, 3, 4, 5, 6, 7]
 * It took  swaps to sort the array.
 * <p>
 * Function Description
 * <p>
 * Complete the function minimumSwaps in the editor below.
 * <p>
 * minimumSwaps has the following parameter(s):
 * <p>
 * int arr[n]: an unordered array of integers
 * Returns
 * <p>
 * int: the minimum number of swaps to sort the array
 * Input Format
 * <p>
 * The first line contains an integer, , the size of .
 * The second line contains  space-separated integers .
 * <p>
 * Constraints
 * <p>
 * Sample Input 0
 * <p>
 * 4
 * 4 3 1 2
 * Sample Output 0
 * <p>
 * 3
 * Explanation 0
 * <p>
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 * <p>
 * Sample Input 1
 * <p>
 * 5
 * 2 3 4 1 5
 * Sample Output 1
 * <p>
 * 3
 * Explanation 1
 * <p>
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 * <p>
 * Sample Input 2
 * <p>
 * 7
 * 1 3 5 2 4 6 7
 * Sample Output 2
 * <p>
 * 3
 * Explanation 2
 * <p>
 * Given array
 * After swapping  we get
 * After swapping  we get
 * After swapping  we get
 * So, we need a minimum of  swaps to sort the array in ascending order.
 */
public class Q04MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) continue;
            result++;
            int tmp = arr[i];
            arr[i] = arr[tmp - 1];
            arr[tmp - 1] = tmp;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
//        System.out.println(minimumSwaps(new int[]{2, 3, 4, 1, 5}));
//        System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
    }
}
