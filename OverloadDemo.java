public class OverloadDemo {
    int x;
    OverloadDemo(){
        System.out.println("Insedde OverloadDemo(). ");
        x =0;
    }
    OverloadDemo(int i){
        System.out.println("Insedde OverloadDemo(int). ");
        x =i;
    }
    OverloadDemo(double i){
        System.out.println("Insedde OverloadDemo(). ");
        x =(int) d;
    }
    OverloadDemo(int i, int j){
        System.out.println("Insedde OverloadDemo(). ");
        x =0;
    }
}
