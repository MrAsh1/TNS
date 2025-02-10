package Day4;

public class ConstructorDemo {
    public static void main (String[] args) {
        Customer c = new Customer("Ashish", 1, "Karad");
        String Name = c.getCustomerName();
        System.out.println(Name);
    }
}
