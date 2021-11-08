package cat.daw.m3.nivell1;

public class overload {

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add("hello ","world"));
    }

    public static int add(int a, int b) { 
        return a+b;
    }

    public static int add(int a, int b, int c) { 
        return a+b+c;
    }

    public static String add(String a, String b) { 
        return a+b;
    }
    
}
