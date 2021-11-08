package cat.daw.m3.nivell1;


interface Speakable {

    String speak = "_Frog, I am a Frog, What do I say? Ribbit, ribbit, I say it all day._";

}

public class App implements Speakable {

    public static void main(String[] args) throws Exception {
        methods.myMethod2();
        Amphibian.Frog();
        System.out.println(speak);

    }

    public void constructor() { //metode
    }

    public static void myMethod() { //metode
        System.out.println("You have called me! My name is: myMethod!");
    }


}
