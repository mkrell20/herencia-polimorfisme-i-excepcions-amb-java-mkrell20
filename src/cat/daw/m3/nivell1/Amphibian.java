package cat.daw.m3.nivell1;

public class Amphibian {

    String color;
    String breed;
    int age;

    class Frog extends Amphibian {

    }

    public static void Frog() {
    }
    
    public void jump(int jumps){
        try{ 
            if (jumps > 3) {
                throw new Exception("The frog cant jump more than three times");
            }
            else {
                System.out.println("The frog has jumped " + jumps + (jumps == 1 ? " times" : " times") + " !!");
            }
  
        }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
