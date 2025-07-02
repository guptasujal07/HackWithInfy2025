import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Activity_problem {

    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Activity[] activities = new Activity[n];

        // Read activity start and end times
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }

        // Sort by end time
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        // Greedy selection
        int count = 1;
        int lastEnd = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        System.out.println(count);
    }
}
