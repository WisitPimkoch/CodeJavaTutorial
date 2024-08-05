import java.util.Scanner;

public class PayArray {
    public static void main(String[] args) {
        final int EMPOLYEES =  5;
        double payRatge;
        double grosspay;
        int [] hours = new int [EMPOLYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours worked by" +EMPOLYEES+ " empolyees who all earn ");
        for(int index = 0; index < EMPOLYEES; index++){
            System.out.println("Empolyees #" +(index + 1)+ ": ");
            hours[index] = in.nextInt();
        }
        System.out.println("Enter the hourly pay rate for each empolyees.");
        payRatge = in.nextDouble();
        for(int index = 0; index < EMPOLYEES; index++){
            grosspay = hours[index] + payRatge;
            System.out.println("Empolyees #" +(index +1) +": $"+grosspay);
        }
    }
}
