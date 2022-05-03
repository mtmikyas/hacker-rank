package interviewprep.warmup;

import java.util.List;

public class Q03JumpingOnTheClouds {


    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int result = 0;
        int k = 0;
        while (k < c.size() - 1) {
            if (k + 2 < c.size() && c.get(k + 2) == 0) {
                k += 2;
            } else {
                k++;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
    }
}
