package Day9;

public class MethodOverLoading {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }
    public static float addition(float a,float b){
        return a+b;
    }
    public static float  addition(float a,int b){
        return a+b;
    }
    public static String addition (String a,String b){
        String s = a + b;
        return s;
    }
}
