import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{1,2},{1,2},{1,2}};

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);


        for(int[] i : intervals) {
            System.out.println(Arrays.toString(i));
        }
        int ans = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[ans][1]) {
                intervals[i][1] = intervals[ans][1];
                ans++;
            }
        }
        System.out.println(ans);
    }
}
