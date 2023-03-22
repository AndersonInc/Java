//In this lesson we learn about variables
/*
* Variables are categorized into two i.e. primitive and non primitive
* 1.Primitive includes the string,arrays,classes, interfaces
* 2.Non primitive includes the numerical and non numerical
*       a.Numerical includesL: short,long,int,float,double etc
*       b.Non numerical includes char
* Further more Variables can be classified as being:
*   1.Static. These have a static keyword on them
*   2.Local.These are defined with in a method body
*   3.Instance. These don.t have the static key word in them
*
* A varible follows two things, you have to declare it and the initialize it.
* Youcan do all the two at once
* Lets see an example of the above*/
public class Variables {
   /* int amount = 5000; //Instance variable

    void trade(){
        double price = 2.5; //Local Variable
    }*/
    //Object mutability- this is the ability to modify a created object it implies the object has setters and getters plus an access metod
    private String college;
    Variables(String s){
        this.college = s;
    }
    public void setCollege(String c){
        this.college = c;
    }
    public String getCollege(){
        return this.college;
    }
public static void main(String[] Args){
        Variables obj = new Variables("Macos");
        obj.setCollege("Cocis");
        System.out.println(obj.getCollege());

}
}
