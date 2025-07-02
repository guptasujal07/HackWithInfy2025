import java.util.Arrays;
import java.util.Scanner;

public class Minimum_numberCoin {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the coin: ");
        String[] tokens = sc.nextLine().split(" ");
        int[] coins = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            coins[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(coins); // sort ascending
        int count = 0;

        System.out.printf("\n minimum coins required  %d\n", amount);

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                System.out.printf("Using coin: %d\n", coins[i]);
                amount -= coins[i];
                count++;
            }
        }

        System.out.printf("Minimum number of coins required: %d\n", count);
    }
    
}
