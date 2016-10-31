
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make scanner
        Scanner input = new Scanner(System.in);

        // Make the dice
        int user = 1;
        //
        while (user != 100) {


            System.out.println("Enter Sum of dice");
            int dice = input.nextInt();
            user = user + dice;
            System.out.println("You've landed onto" + " " + user);
            // Snakes
            if (user == 54) {
                user = 19;
                System.out.println("You fell on a snake you're now on 19");
            }
            if (user == 90) {
                user = 48;
                System.out.println("You've fell onto a snake you're now on 48");
            }
            if (user == 99) {
                user = 77;
                System.out.println("lol bad luck u fell on a snake ur on 77 now lmao");
            }
            // Ladders
            if (user == 9) {
                user = 34;
                System.out.println("nice u landed on a ladder ur now at 34");
            }
            if (user == 40) {
                user = 64;
                System.out.println("good luck u landed onto a ladder ur now on 64");
            }
            if (user == 67) {
                user = 86;
                System.out.println("oooh yea u landed on a ladder ur now at 86");
            }
            // If they win or quit
            if (user == 100) {
                System.out.println("Congrats you win the game");
                break;
            }
            if (dice == 0) {
                System.out.println("k then, guess you quit");
                break;
            }







        }
    }
}
