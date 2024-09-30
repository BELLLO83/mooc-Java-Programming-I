
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" + "What is the main character called?");
        String ada = reader.nextLine();
        System.out.println("What is their job?");
        String ds = reader.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + ada + ", who was " + ds + ".");
        System.out.println("On the way to work, " + ada + " reflected on life.");
        System.out.println("Perhaps " + ada + " will not be " + ds + " forever.");
       

    
       
       

    }
}
