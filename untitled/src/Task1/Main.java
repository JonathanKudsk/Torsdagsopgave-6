package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jonathan", "Kudsk","JonathanKudsk123" ));
        customers.add(new Customer("Simon", "Roenest","SimonRoenest123" ));
        customers.add(new Customer("Frederik", "Wissing","FrederikWissing123" ));

        printCustomers(customers);
    }
    static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers){
            System.out.println(c);
        }

    }

}