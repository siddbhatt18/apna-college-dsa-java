import java.util.*;
public class ActivitySelection {
    public static ArrayList<Integer> selectMaxActivity(int start[], int end[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int activity[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        Arrays.sort(activity, Comparator.comparingInt(o -> o[2]));
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for(int i = 1; i < end.length; i++) {
            int idx = activity[i][0];
            int currStart = activity[i][1];
            int currEnd = activity[i][2];
            if(currStart >= lastEnd) {
                ans.add(idx);
                lastEnd = currEnd;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5, 6, 5};
        int end[] = {2, 4, 6, 7, 9, 9, 10, 9};
        ArrayList<Integer> result = selectMaxActivity(start, end);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}