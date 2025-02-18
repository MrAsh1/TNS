package Day9;

public class FinalVariable {
   // final int a;
    final int x=100;
    final static int y;
    final static int z=10;

    //instance method
    void change(){
      //  x=200;
      //  y=100;
    }

    @Override
    public String toString() {
        return "FinalVariable{" + "x=" + x + '}';
    }
    static {
        System.out.println(z);
        y=20;
        System.out.println(y);
    }

}
