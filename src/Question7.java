
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a scanner
        Scanner input = new Scanner(System.in);
        // Grab the speed limit
        System.out.println("Enter the speed limit");
        int speedlimit = input.nextInt();
        // Get the car's speed
        System.out.println("Enter the recorded speed of the car");
        int carspeed = input.nextInt();


        // Calculate speeds and fines
        if (speedlimit >= carspeed) {
            System.out.println("Congrats, you're not speeding");
        } else {
            if (carspeed <= speedlimit + 20) {
                int fine1 = (0 + 100);
                System.out.println("You're speeding, Your fine is:" + " $" + fine1);
            } else {
                if (carspeed <= speedlimit + 30) {
                    int fine2 = (0 + 270);
                    System.out.println("You're speeding, Your fine is:" + " " + fine2);
                } else {
                    if (carspeed <= speedlimit + 31) {
                        int fine3 = (0 + 500);
                        System.out.println("You're speeding, Your fine is:" + " " + fine3);

                    } else {
                        if (carspeed > speedlimit + 31) {
                            int fine4 = (0 + 500);
                            System.out.println("You're speeding, Your fine is:" + " " + fine4);
                        }
                    }
                }

            }

        }



    }
}
