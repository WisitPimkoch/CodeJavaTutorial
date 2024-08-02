public class Ex5_3 {

   public static int findMax(int num1, int num2) {
    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}
public static void main(String[] args) {
    int number1 = 8;
    int number2 = 15;
    int max = findMax(number1, number2);
    System.out.println("The maximum value is: " + max);
}
}
