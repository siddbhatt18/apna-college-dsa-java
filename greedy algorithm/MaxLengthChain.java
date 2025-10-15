import java.util.*;
public class MaxLengthChain {
    public static int maxLengthPairs(int pair[][]) {
        Arrays.sort(pair, Comparator.comparingInt(o -> o[1]));
        int pairEnd = pair[0][1];
        int pairCount = 1;
        for(int i = 1; i < pair.length; i++) {
            int start = pair[i][0];
            int end = pair[i][1];
            if(start >= pairEnd) {
                pairCount++;
                pairEnd = end;
            }
        }
        return pairCount;
    }
    public static void main(String[] args) {
        int pair[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println(maxLengthPairs(pair));
    }
}