
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make Scanner
        Scanner input = new Scanner(System.in);
        // Make the user input the costs
        System.out.println("How much does the food for prom cost?");
        int prom = input.nextInt();
        System.out.println("How much does the dj cost?");
        int dj = input.nextInt();
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost?");
        int decorations = input.nextInt();
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        System.out.println("How much for miscellanous costs?");
        int miscellanous = input.nextInt();
        // Calculate the costs
        double total = (prom + dj + hall + decorations + staff + miscellanous);
        // Divide the costs by tickets then tell user
        System.out.println("Your total cost is" + " " + "$" + total);
        System.out.println("You will need to sell" + " " + total / 35 + " " + "Tickets to break even");
    }
}
