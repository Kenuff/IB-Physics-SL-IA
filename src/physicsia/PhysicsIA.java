package physicsia;
/**
 * IB Physics SL - Internal Assessment (IA)
 * Doppler Effect Simulator
 * January 2021
 * @author Barbod Habibi
 */
public class PhysicsIA {
    public static void main(String[] args) {
        // declaration
        Receiver person = new Receiver();
        Transmitter vehicle = new Transmitter(-400, 100);
        double distance; // meters
        double Δt; // seconds
        double Δs; // meters
        final double wave_velocity = 343; // meters per second
        double wave_relativeVelocity; // meters per second
        
        System.out.println("Head to head:");
        simulateExperiment(0);
        
        System.out.println("\nVertical displacement of receiver = 50 m");
        simulateExperiment(50);
        
        System.out.println("\nVertical displacement of receiver = 100 m");
        simulateExperiment(100);
        
        System.out.println("\nVertical displacement of receiver = 150 m");
        simulateExperiment(150);
        
        System.out.println("\nVertical displacement of receiver = 200 m");
        simulateExperiment(200);
    }
    
    // get the instantaneous distance between the receiver and transmitter
    public static double getDistance(Receiver person, Transmitter vehicle) {
        double distance_x = person.getPosition() - vehicle.getPosition(); // horizontal distance
        double distance_y = person.getVerticalPosition(); // vertical distance
        
        double distance = Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2)); // Pythagorean theorem
        
        return distance;
    }
    
    public static void simulateExperiment(double verticalPosition) {
        // declaration
        Receiver person = new Receiver(0, verticalPosition);
        Transmitter vehicle = new Transmitter(-400, 100);
        double distance; // meters
        double Δt; // seconds
        double Δs; // meters
        final double wave_velocity = 343; // meters per second
        double wave_relativeVelocity; // meters per second
        
        for (int t = 0; t <= 4; t++) {
            distance = getDistance(person, vehicle);
            wave_relativeVelocity = vehicle.getVelocity() + wave_velocity;
            Δt = distance / wave_relativeVelocity;
            System.out.println("Δt[" + t + "] = " + Δt + " s");
            
            Δs = vehicle.getVelocity() * 1;
            vehicle.updatePosition(Δs);
        }
    }
    
}
