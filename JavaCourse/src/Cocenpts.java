public class Cocenpts {
    //Let me talk about mutability
    private String college = "CEDAT";
   /* Cocenpts(String s){
        this.college = s;
    }*/
    public void setCollege(String c){
        this.college = c;
    }
    public String getCollege(){
        return this.college;
    }

    public static void main(String[] Args){
        Cocenpts obj = new Cocenpts();
        obj.setCollege("Cocis");
        System.out.println(obj.getCollege());

    }
}
