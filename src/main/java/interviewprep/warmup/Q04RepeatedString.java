package interviewprep.warmup;

public class Q04RepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here
        int reminder = Math.floorMod(n, s.length());
//        long reminder =  n% s.length();
        long countOfa = s.chars().filter(c -> c == 'a').count();
        long countOfaSub = s.substring(0, reminder).chars().filter(c -> c == 'a').count();
        return (n / s.length()) * countOfa + countOfaSub;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10));
    }
}
