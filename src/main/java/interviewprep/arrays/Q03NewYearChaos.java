package interviewprep.arrays;

import java.util.List;

/**
 * It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.
 * <p>
 * Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
 * <p>
 * Example
 * [1,2,3,4,5,6,7,8]
 * <p>
 * If person 5 bribes person 4, the queue will look like this: [1,2,3,5,4,6,7,8]. Only 1  bribe is required. Print 1.
 * [4,1,2,3]
 * <p>
 * Person  had to bribe  people to get to the current position. Print Too chaotic.
 * <p>
 * Function Description
 * <p>
 * Complete the function minimumBribes in the editor below.
 * <p>
 * minimumBribes has the following parameter(s):
 * <p>
 * int q[n]: the positions of the people after all bribes
 * Returns
 * <p>
 * No value is returned. Print the minimum number of bribes necessary or Too chaotic if someone has bribed more than  people.
 * Input Format
 * <p>
 * The first line contains an integer , the number of test cases.
 * <p>
 * Each of the next  pairs of lines are as follows:
 * - The first line contains an integer , the number of people in the queue
 * - The second line has  space-separated integers describing the final state of the queue.
 * <p>
 * Constraints
 * <p>
 * Subtasks
 * <p>
 * For  score
 * For  score
 * <p>
 * Sample Input
 * <p>
 * STDIN       Function
 * -----       --------
 * 2           t = 2
 * 5           n = 5
 * 2 1 5 3 4   q = [2, 1, 5, 3, 4]
 * 5           n = 5
 * 2 5 1 3 4   q = [2, 5, 1, 3, 4]
 * Sample Output
 * <p>
 * 3
 * Too chaotic
 */
public class Q03NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribe = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) > i + 3) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) {
                    bribe++;
                }
            }
        }
        System.out.println(bribe);
    }

    public static void main(String[] args) {
//        minimumBribes(List.of(2, 1, 5, 3, 4));
//        minimumBribes(List.of(2, 5, 1, 3, 4));
        minimumBribes(List.of(1, 2, 5, 3, 7, 8, 6, 4));
    }
}
