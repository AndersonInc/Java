import java.util.Arrays;
import java.util.Scanner;

public class DataStructures {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        //In this tutorial we gonna look at data strutures
        /*
        * Data structures are a kind of storage
        * They are categorized into 2 i,e linear and non linear
        * Linear are divided into static e.g arrays and dynamic e.g ques,linked lists,stacks etc
        * Non linear include trees and graphs
        * We will start with arrays. These include 1 dimension arrays and 2 dimensional arrays*/

        //Array initialization
        int[] array={1,2,3,4,5};
        System.out.print("Elements of the array: ");
        //traversing through the array
        for(int i: array) {
            System.out.print(i + ",");
        }
            //Operations of the array
            //Insertion we can insert elements into a particular index
            int[] numbers={2,3};
           // numbers[3]=5;
        for (int i:numbers
             ) {
            System.out.println(i);

        }
        int[] price = new int[3];
        price[0]=2;
        price[1]=3;
        price[2]=4;
        System.out.println(Arrays.toString(price));

        //Array searching
        for(int i:price){
            if (i<=3){
                System.out.println("Got it.it is "+i);
                //break;
            }
        }
        //The above are 1D arrays
        //Lets take a look at 2d arrays
        int[][] matrix = {{1,2,3},{3,5,7},{9,0,8}};
        for (int i=0;i<3;i++){
            for (int k=0;k<3;k++){
                //System.out.println(matrix[i][k]);
                //System.out.println("matrix[" + i + "][" + k
                     //   + "]=" + matrix[i][k]);
                System.out.println("Matrix ["+i+"]["+k+"]" +matrix[i][k]);


            }
        }
        //Searching through the array
        int[]arr = {10,12,13,17,100,26,18,28,11,9};
        int x;
        System.out.println("Enter the number you wanna search: ");
        x = input.nextInt();
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                System.out.println(i);
            }
        }



        }
    }

