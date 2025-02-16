package Day5.Inheritance;

public class Citizen {
    private String name;
    private String Pan;
    private String address;
    private long phone;

    public Citizen(){
        super();
        System.out.println("Citizen Object is Created");
    }

    public static void main(String[]args){
        Citizen c =new Citizen();
    }
}
