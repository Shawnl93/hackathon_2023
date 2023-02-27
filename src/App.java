import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Page start = new Page("Welcome!");
        // Page waterfall = new Page("You're at a waterfall!");
        // Page ogre = new Page("There's an ogre on a pile of rocks here");

        // start.addChoice("go left", waterfall);le
        // start.addChoice("go right", ogre);
        
        // start.displayText();
        // start.displayChoices();
        System.out.println("----------");
        System.out.println("CHOOSE YOUR ADVENTURE BUT NOT REALLY CUS THERE'S ONLY 1 PATH!!!");
        System.out.println("PLEASE CHOOSE A DOOR (choose Right)");
        System.out.println("----------");
        String response1 = input.nextLine();
        response1 = response1.toLowerCase();

        if (response1.contains("right")) {
            System.out.println("----------");
            System.out.println("YOU WENT THROUGH THE RIGHT DOOR.");
            System.out.println("YOU SEE A GIANT ROCK. ");
            System.out.println( "THROW OR BREAK ROCK? ");
            System.out.println("----------");
            String response2 = input.nextLine();
            if (response2.contains("throw")){
                System.out.println("----------");
                System.out.println( "YOU REALIZED THERE IS SOMETHING INSIDE THE ROCK");
                System.out.println( "BREAK OR BREAK ROCK?");
                System.out.println("----------");
                String response3 = input.nextLine();
                if (response3.contains("break")){
                    System.out.println("----------");
                    System.out.println("YOU BROKE THE ROCK");
                    System.out.println("YOU FOUND A 10$ GIFT CARD!! SIDE EYES");
                    System.out.println("----------");
                }
            } else if (response2.contains("break")){
                System.out.println("----------");
                System.out.println("YOU BROKE THE ROCK");
                System.out.println("YOU FOUND A 10$ GIFT CARD!! SIDE EYES");
                System.out.println("----------");
            }
        } else if (response1.contains("left")) {
            System.out.println("YOU WENT THROUGH THE LEFT DOOR.");
        }

    }
}
