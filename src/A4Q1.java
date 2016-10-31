
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make the scanner
        Scanner input = new Scanner(System.in);
        // Get the users name
        System.out.println("Please Enter your name");
        // store name
        String name = input.nextLine();
        // Say hello
        System.out.println("Hello, How are you today " + name);


    }
}
