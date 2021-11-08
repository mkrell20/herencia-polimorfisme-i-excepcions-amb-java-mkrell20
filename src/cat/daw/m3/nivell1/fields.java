package cat.daw.m3.nivell1;

public class fields {

    static final int number = 5; // belongs to a class
                                 // will be identical across the entire class
                                 // can be accessed by static or non-static methods

    final int year = 2020; // belongs to an INSTANCE of a class
                           // can be different for different instance
                           // can be accessed by non-static methods only
    

    public void constructor3() { //metode
        System.out.println("This is" + year);
    }

                       
    public static void myMethod3() { //metode
        System.out.println("This is" + number);
    }
}
