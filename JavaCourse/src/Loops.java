public class Loops {
    public static void main(String Args[]){
        //Loops are a block of code that executes over a given period of time under a certain coondition untill that condition is evaluate
        //Imagine typing the word "hello world" 100 times it would take you alot to repeat such statements 100 times thanks to loops
        //We shall start with the for loop this one
        //the syntax follows for(initialiation;condition;update statement){ body of the for loop} lets take an example
        for(int i=0;i<100;i++){
            System.out.println("Hello world 100 times");
        }
        //Lets look at a while loop
        int i=20;
        while(i>0){
            System.out.println("Java is fun");
            i--;
        }
        //lets look at a do while loop
        do {
            System.out.println("I am a live mixer");
            i--;
        }while (i>0);
        //For each loop: this can be used to iterate through a loop
        int[] numbers = {3, 7, 5, -5};
        for (int number:numbers
             ) {
            System.out.print(","+number+"");
        }

    }
}
