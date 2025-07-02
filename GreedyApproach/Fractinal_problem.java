import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Fractinal_problem{

    static class Item {
        int value, weight;
        double ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item and  kanpsack capacity ");

        int n = sc.nextInt();
        int W = sc.nextInt();


        Item[] items = new Item[n];
        System.out.println("Enter the values and weights of each item ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(value, weight);
        }


        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double maxValue = 0.0;


        for (Item item : items) {
            if (W >= item.weight) {

                maxValue += item.value;
                W -= item.weight;
            } else {

                maxValue += item.ratio * W;
                break;
            }
        }


        System.out.printf("maximum value:%.2f\n", maxValue);
    }
}
