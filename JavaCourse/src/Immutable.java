public class Immutable {
    //We will be looking at immutable objects in this course
    //This is characterized by the final key word
    private final String name;
    Immutable(String n){
        this.name = n;

    }
    public final String getName(){
        return this.name;
    }
    //thread safe

    public static void main(String[]Args){
        Immutable obj = new Immutable("Anderson");
        System.out.println(obj.getName());

    }

}
