
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make the scanner
        Scanner input = new Scanner(System.in);
        // Enter in minutes
        System.out.println("Enter your minutes");
        System.out.println("Number of day time minutes?");
        double daytimeminutes = input.nextDouble();
        System.out.println("Number of evening minutes?");
        double eveningminutes = input.nextDouble();
        System.out.println("Number of weekend minutes?");
        double weekendminutes = input.nextDouble();

        // Calculate the cost 
        double plana = (((daytimeminutes - 100) * 25 + eveningminutes * 15 + weekendminutes * 20) / 100);
        double planb = (((daytimeminutes - 250) * 45 + eveningminutes * 35 + weekendminutes * 25) / 100);
        System.out.println("Plan A Costs:" + " " + plana);
        System.out.println("Plan B Costs:" + " " + planb);
        if (plana > planb) {
            System.out.println("Plan B is the cheapest");

        } else {
            if (plana < planb) {
                System.out.println("Plan A is the cheapest");
            } else {
                if (plana == planb) {
                    System.out.println("Plan A and B cost the same");
                }
            }
        }
    }
}
