import java.util.Scanner;
public class calnum {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);

        System.out.print("Input Number1: ");
        x = in.nextInt();
        System.out.println("Your Number is "+x);

        System.out.print("Input Number2: ");
        y = in.nextInt();
        System.out.println("Your Number is "+y);
        System.out.println(x+ " + " +y+ " = " +(x+y));
    }
}
