package Day5.FirstPackage;

public class Base {
    int varDefault = 10;
    public int varPublic = 10;
    private int varPrivate = 20;
    protected int varProtected = 30;

    private int methodPrivate(){
        return (varPrivate);
    }
    public int methodPublic(){
        return (varPublic);
    }
    protected int methodProtected(){
        return (varProtected);
    }

    public static void main(String[]args){
    Base b = new Base();
    System.out.println(b.methodPrivate());
    System.out.println(b.methodPublic());
    System.out.println(b.methodProtected());
    };
}
class Base2 {

public static void main (String[]args){
    Base c = new Base();
    System.out.println(c.methodPublic());
    System.out.println(c.methodProtected());
}
}
