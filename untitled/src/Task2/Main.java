package Task2;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        for (String Cafe : cafe.getCoffeeMenu()) {
            System.out.println(Cafe);
        }
    }
}
