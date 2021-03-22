package physicsia;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 * IB Physics Standard Level (SL)
 * Internal Assessment(IA) - Java Code Implementations
 * March 2021
 * @author Barbod Habibi
 */
public class Calculations {
    public static void main(String[] args) {
        // declaration
        Scanner input = new Scanner(System.in);
        double alpha, beta;
        double delta_alpha, delta_beta; // absolute uncertainty of alpha and beta variables
        
        // data obtainment
        System.out.println("Initial angle: ");
        alpha = input.nextDouble();
        System.out.println("Final angle: ");
        beta = input.nextDouble();
        System.out.println("Initial angle uncertainty: ");
        delta_alpha = input.nextDouble();
        System.out.println("Final angle uncertainty: ");
        delta_beta = input.nextDouble();
        
        alpha = convert(alpha); // convert initial angle to radians
        beta = convert(beta); // convert final angle to radians

        // output data
        System.out.println("\nefficiency(%) = " + efficiency(alpha, beta));
        System.out.println("absolute uncertainty(%) = " + efficiency(alpha, beta) *
                uncertainty(alpha, beta, delta_alpha, delta_beta));
    }
    
    // calculate the efficiency of the transfer of energy
    public static double efficiency(double alpha, double beta) {
        return (1 - Math.cos(beta)) / (1 - Math.cos(alpha)) * 100;
    }
    
    // calculate the fraction uncertainty of the calculated efficiency
    public static double uncertainty(double alpha, double beta, double delta_alpha, double delta_beta) {
        return (sin(alpha) * PI * delta_alpha / (180 * cos(alpha))) +
                (sin(beta) * PI * delta_beta / (180 * cos(beta)));
    }
    
    // helper method - convert degrees to radians
    public static double convert(double angle) {
        return angle * PI / 180;
    }
}