
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // ask for the the users input
        System.out.println("Enter Measurement in inches you wish to convert");
        // store the users input
        double measurement = input.nextDouble();
        // Calculate the measurement
        double converted = measurement * 2.54;
        System.out.println(measurement + " inches is the same as " + converted);

    }
}
