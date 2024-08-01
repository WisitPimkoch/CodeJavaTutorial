public class Testdowhile {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("i in for : " +i);
        }

        int iwhile = 1;  
        while(iwhile <= 10) {
            System.out.println("iwhile : " +iwhile);
            iwhile++;
        }
        int counter = 1;  
        do{
            System.out.println("counter in dowhile : " +counter);
            counter++;
        }while(counter <= 10);
    }
}
