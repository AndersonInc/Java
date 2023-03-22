public class A extends ConstructorChaining {
    A() {
        this("This is A");
        //this("20");
    }
    A(String s){
        System.out.println(s+" This is the method with the string too");

    }
    A(int s){
        System.out.println(s);
    }

    public int abc(int a){
        System.out.println("This is override");
        return a*2;
    }

}
