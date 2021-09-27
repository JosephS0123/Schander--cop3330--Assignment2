package ex38;;
import java.util.Scanner;

public class App {
    public static String even(String numbers) {
        StringBuilder evens = new StringBuilder();
        int j;
        String[] nums = numbers.split(" ");
            for (String num: nums) {
                if (!num.isEmpty()) {
                    j = Integer.parseInt(num);
                    if (j % 2 == 0) {
                        evens.append(num);
                        evens.append(" ");
                    }
                }
            }
        return evens.toString();
        }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by spaces:");
        String numbers = uInput.nextLine();
        System.out.println("The even numbers are: "+even(numbers));
    }
}
