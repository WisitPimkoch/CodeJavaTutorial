public class WhileLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(+i);
        }

        int iWhile = 1;
        while (iWhile <= 10) {
            System.out.println("Result in whileloop : " +iWhile);
            iWhile += 2 ;
        }
    }
}