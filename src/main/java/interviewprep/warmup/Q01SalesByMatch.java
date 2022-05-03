package interviewprep.warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * <p>
 * Example
 * <p>
 * <p>
 * There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
 * <p>
 * Function Description
 * <p>
 * Complete the sockMerchant function in the editor below.
 * <p>
 * sockMerchant has the following parameter(s):
 * <p>
 * int n: the number of socks in the pile
 * int ar[n]: the colors of each sock
 * Returns
 * <p>
 * int: the number of pairs
 * Input Format
 * <p>
 * The first line contains an integer , the number of socks represented in .
 * The second line contains  space-separated integers, , the colors of the socks in the pile.
 * <p>
 * Constraints
 * <p>
 * where
 * Sample Input
 * <p>
 * STDIN                       Function
 * -----                       --------
 * 9                           n = 9
 * 10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
 * Sample Output
 * <p>
 * 3
 */
public class Q01SalesByMatch {

    public static void main(String[] args) {
        System.out.println(sockMerchant(5, List.of(-1, 1, 3, 2, 2, 2, 5, 6, -1)));
//        List<Integer> list = Arrays.asList(new Integer[]{-1, -1, 2, 2, null, null});
//        System.out.println(sockMerchant(2, list));
    }


    public static List<Integer> sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer sock : ar) {
            if (sock == null)
                continue;
            if (hashMap.containsKey(sock)) {
                hashMap.put(sock, hashMap.get(sock) + 1);
            } else {
                hashMap.put(sock, 1);
            }
            List<Integer> asd = new ArrayList<>();

        }
//        return hashMap.values().stream().reduce(0, (a, b) -> a + (b / 2));
        return hashMap.entrySet().stream().filter(m -> m.getValue() == n).map(Map.Entry::getKey).collect(Collectors.toList());
//        return hashMap.values().stream().filter(v -> v == n).collect(Collectors.toList());
    }


}
