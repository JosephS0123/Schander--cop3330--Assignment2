package ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static double average(ArrayList<String> numbers){
        double avg = 0;
        for (int i = 0; i < numbers.size();i++){
            avg += Integer.parseInt(numbers.get(i));
        }
        return (avg/numbers.size());
    }
    public static int min(ArrayList<String> numbers){
        int min = Integer.parseInt(numbers.get(0));
        for (int i = 1; i < numbers.size();i++){
            if(Integer.parseInt(numbers.get(i)) < min){
                min = Integer.parseInt(numbers.get(i));
            }
        }
        return min;
    }
    public static int max(ArrayList<String> numbers){
        int max = Integer.parseInt(numbers.get(0));
        for (int i = 1; i < numbers.size();i++){
            if(Integer.parseInt(numbers.get(i)) > max){
                max = Integer.parseInt(numbers.get(i));
            }
        }
        return max;
    }
    public static String stdDev(ArrayList<String> numbers){
        DecimalFormat DF = new DecimalFormat("##.##");
        double mean = average(numbers);
        double total = 0;
        for (int i = 0; i < numbers.size();i++){
            total += Math.pow(Math.abs(Integer.parseInt(numbers.get(i))-mean),2);
        }
        return DF.format(Math.sqrt(total/numbers.size()));
    }
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("##.##");
        Scanner uInput = new Scanner(System.in);
        String num;
        ArrayList nums = new ArrayList<String>();
        while (true){
            System.out.println("Enter a number.");
            num = uInput.nextLine();
            if (num.equals("done")){
                break;
            }
            if(num.matches("\\d+")){
            nums.add(num);
            }
        }
        System.out.print("Numbers: ");
        for(int i = 0; i < nums.size();i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        System.out.println("The average is: "+DF.format(average(nums)));
        System.out.println("The min is: "+min(nums));
        System.out.println("The max is: "+max(nums));
        System.out.println("The standard deviation is: "+ (stdDev(nums)));
    }
}
