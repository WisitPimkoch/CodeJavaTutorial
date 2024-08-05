import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        final int EMPOLYEES = 3;
        int[] hours = new int[EMPOLYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours workec by " +EMPOLYEES+ " empolyees.");
        for(int index = 0; index < EMPOLYEES; index++){
            System.out.println("Empolyees " +(index + 1) + " : ");
            hours[index] = in.nextInt();
        }
        System.out.println("The hours you entered are : ");
        for(int index = 0; index < EMPOLYEES; index++){
            System.out.println(hours[index]);
        }
    }
}
