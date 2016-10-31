
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Ask for 4 different numbers on seperate lines
        System.out.println("Please enter in 4 numbers on seperate lines");
        // store the users numbers
        double line1 = input.nextDouble();
        double line2 = input.nextDouble();
        double line3 = input.nextDouble();
        double line4 = input.nextDouble();
        // Tell the user their numbers all on the same line
        System.out.println("Your numbers were" + ", " + line1 + ", "
                + line2 + ", " + line3 + ", " + line4);

    }
}
