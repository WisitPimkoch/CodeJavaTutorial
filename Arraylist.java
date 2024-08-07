import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList namelist = new ArrayList<>();
        namelist.add("Ball");
        namelist.add("Java");
        namelist.add("Micro");
        System.out.println("The ArrayList has "+namelist.size()+ "object stored in it.");
        for(int i = 0; i < namelist.size(); i++){
            System.out.println(namelist.get(i));
        }
    }
}
