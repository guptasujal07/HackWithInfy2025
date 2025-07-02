import java.util.Arrays;
import java.util.Scanner;

public class Job_sequencing {

    static class Job {
        String id;
        int deadline;
        int profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Job[] jobs = new Job[n];
        System.out.println("Enter jobs in format: job_id deadline profit");

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String id = parts[0];
            int deadline = Integer.parseInt(parts[1]);
            int profit = Integer.parseInt(parts[2]);
            jobs[i] = new Job(id, deadline, profit);
        }

        // Sort jobs by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find maximum deadline to define time slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Track slots: true if occupied
        boolean[] slots = new boolean[maxDeadline];
        int totalProfit = 0;

        for (Job job : jobs) {
            // Try to find a slot from job.deadline - 1 to 0
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!slots[j]) {
                    slots[j] = true; // occupy slot
                    totalProfit += job.profit;
                    System.out.printf("Scheduled job %s in slot %d\n", job.id, j + 1);
                    break;
                }
            }
        }

        System.out.println("Maximum total profit: " + totalProfit);
    }
}
