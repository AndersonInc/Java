public class Functions {
    //In this tutorial you will learn about functions commonly known
    //Methods are a block of code that execute when called
    //A method has to be firstly declared and defined and afterwards it can be called
    //Lets take an example
    public static void gadgets(){
        //The static keyword shows that this method is an object of the class function
        String name,brand,serialNo;
        int pin;
        System.out.println("This is a method");
    }
    public static void animal(String name,String species){
        System.out.println("This is " +name+ " from the " +species);
        //This method takes in arguments therefore that forms what we call a method signiture
    }
    //Lets look .at a method that takes in arguments and returns
    //This method indicates that its taking in intergers and returning smilarly integers
    public static int addition(int x,int y){
        return x+y;

    }

    //Lets look at method overloading
    //This is where we have multiple methods with the same name but different parameter
    static int multiplication(int x,int y){
        return x*y;
    }
    static double multiplication(double x,double y){
        return x*y;
    }
    //Lets look at recursion for now -> this is making a function call itself
    //Imagine adding numbers from 1 to 10 it would be tiresome thanks to recursion
    static int add(int k){
        int sum =0;
        if(k>0){
            return k+ add(k-1);
        }else {
            return 0;
        }

    }
    public static void main(String[] Args){
//this is a method call
        gadgets();
        animal("Cow","Mammal");
        System.out.println(addition(10,5));
        System.out.println(multiplication(2,3));
        System.out.println(multiplication(1.5,2));
        System.out.println(add(10));


    }
}
