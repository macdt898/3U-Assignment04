
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author macdt8987
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make scanner
        Scanner input = new Scanner(System.in);
        // Get the user's name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        // Grab the test marks
        // First Test
        System.out.println("What was the First test outve?");
        double test1total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test1mark = input.nextDouble();
        // Seconds test
        System.out.println("What was the Second test outve?");
        double test2total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test2mark = input.nextDouble();
        // Third test
        System.out.println("What was the Third test outve?");
        double test3total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test3mark = input.nextDouble();
        // Fourth test
        System.out.println("What was the Fourth test outve?");
        double test4total = input.nextDouble();
        System.out.println("What mark did you get?");
        double test4mark = input.nextDouble();
        // Fifth Test
        System.out.println("What was the Fifth test outve?");
        double test5total = input.nextDouble();
        System.out.println("What mark did you get");
        double test5mark = input.nextDouble();

        // Calculate the test marks
        System.out.println("Test scores for " + name);
        // Test 1
        double test1 = (test1mark / test1total * 100);
        System.out.println("Test 1" + ":" + " " + test1 + "%");
        // Test 2
        double test2 = (test2mark / test2total * 100);
        System.out.println("Test 2" + ":" + " " + test2 + "%");
        // Test 3
        double test3 = (test3mark / test3total * 100);
        System.out.println("Test 3" + ":" + " " + test3 + "%");
        // Test 4
        double test4 = (test4mark / test4total * 100);
        System.out.println("Test 4" + ":" + " " + test4 + "%");
        // Test 5
        double test5 = (test5mark / test5total * 100);
        System.out.println("Test 5" + ":" + " " + test5 + "%");
        // Average 
        double average = (test1 + test2 + test3 + test4 + test5);
        double average2 = (average / 5);
        System.out.println("Average:" + " " + average2 + "%");
    }
}
