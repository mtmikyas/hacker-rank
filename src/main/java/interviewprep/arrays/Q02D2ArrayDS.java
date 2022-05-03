package interviewprep.arrays;

import java.util.List;

/**
 * Given a  2D Array, :
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:
 * <p>
 * a b c
 * d
 * e f g
 * There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
 * <p>
 * Example
 * <p>
 * <p>
 * -9 -9 -9  1 1 1
 * 0 -9  0  4 3 2
 * -9 -9 -9  1 2 3
 * 0  0  8  6 6 0
 * 0  0  0 -2 0 0
 * 0  0  1  2 4 0
 * The  hourglass sums are:
 * <p>
 * -63, -34, -9, 12,
 * -10,   0, 28, 23,
 * -27, -11, -2, 10,
 * 9,  17, 25, 18
 * The highest hourglass sum is  from the hourglass beginning at row , column :
 * <p>
 * 0 4 3
 * 1
 * 8 6 6
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
 * <p>
 * Function Description
 * <p>
 * Complete the function hourglassSum in the editor below.
 * <p>
 * hourglassSum has the following parameter(s):
 * <p>
 * int arr[6][6]: an array of integers
 * Returns
 * <p>
 * int: the maximum hourglass sum
 * Input Format
 * <p>
 * Each of the  lines of inputs  contains  space-separated integers .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the largest (maximum) hourglass sum found in .
 * <p>
 * Sample Input
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 * <p>
 * 19
 * Explanation
 * <p>
 * contains the following hourglasses:
 * <p>
 * image
 * <p>
 * The hourglass with the maximum sum () is:
 * <p>
 * 2 4 4
 * 2
 * 1 2 4
 */
public class Q02D2ArrayDS {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            List<Integer> topList = arr.get(i);
            List<Integer> midList = arr.get(i + 1);
            List<Integer> floorList = arr.get(i + 2);
            int top;
            int mid;
            int floor;
            int tempSum;
            for (int j = 0; j < 4; j++) {
                top = topList.subList(j, j + 3).stream().reduce(0, Integer::sum);
                mid = midList.get(j + 1);
                floor = floorList.subList(j, j + 3).stream().reduce(0, Integer::sum);
                tempSum = top + mid + floor;
                if (tempSum > result) {
                    result = tempSum;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(hourglassSum(List.of(
                List.of(-9, -9, -9, 1, 1, 1),
                List.of(0, -9, 0, 4, 3, 2),
                List.of(-9, -9, -9, 1, 2, 3),
                List.of(0, 0, 8, 6, 6, 0),
                List.of(0, 0, 0, -2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        )));
    }
}
