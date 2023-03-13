import java.util.Objects;
import java.util.Scanner;

public class Conditionals {
    /*
    * In this tutorial you will learn about conditionals
    * */
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of your choice on the next line");
        String day = scanner.nextLine();
        //This is a switch case statement
       /* switch (day) {
            case "tuesday" -> System.out.println("Its a mellow Tuesday");
            case "Monday" -> System.out.println("Its a cozzy" + day);
            case "Wednesday" -> System.out.println("Its a cool" + day);
            case "Thursday" -> System.out.println("Its a yummy " + day);
            case "Friday" -> System.out.println("Alas its a weekend");
        }*/

        //If statement
        if(Objects.equals(day, "Monday")){
            System.out.println("Its a cozzy"+day);
        } else if (Objects.equals(day, "Tuesday")) {
            System.out.println("Its a mellow Tuesday "+day);
        } else if (Objects.equals(day, "Wednesday")) {
            System.out.println("its a cool "+day);
        } else if (Objects.equals(day, "Thursday")) {
            System.out.println("Its is a fun "+day);
        }else{System.out.println("Alas its a weekend " +day);}


    }
}
