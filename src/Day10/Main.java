package Day10;

public class Main {
    public static void main(String[]args){
        RBI rbi = new RBI();
        System.out.println(rbi.getRateOfInterest());
        rbi = new SBI();
        System.out.println(rbi.getRateOfInterest());
        rbi = new ICICI();
        System.out.println(rbi.getRateOfInterest());

    }
}
