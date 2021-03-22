package physicsia;
/**
 * IB Physics SL - Internal Assessment (IA)
 * Doppler Effect Simular - Objects: Transmitter & Receiver
 * January 2021
 * @author Barbod Habibi
 */
public abstract class Object {
    private double position;
    
    // constructor
    Object() {
        position = 0;
    }
    // constructor overload
    Object(double position) {
        this.position = position;
    }
    
    // modifier methods
    public void setPosition(double position) {
        this.position = position;
    }
    public void updatePosition(double Δposition) {
        position += Δposition;
    }
    
    // accessor method
    public double getPosition() {
        return position;
    }
}

class Transmitter extends Object { // defined by velocity & position (x)
    private double velocity;
    
    // constructor
    Transmitter() {
        super();
        velocity = 0;
    }
    // constructor overload
    Transmitter(double position, double velocity) {
        super(position);
        this.velocity = velocity;
    }
    
    // modifier method
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    
    // accessor method
    public double getVelocity() {
        return velocity;
    }
}

class Receiver extends Object { // defined by position (x) & vertical position (y)
    double verticalPosition;
    
    // constructor
    Receiver() {
        super();
        verticalPosition = 0;
    }
    // constructor overload
    Receiver(double position) {
        super(position);
        verticalPosition = 0;
    }
    // constructor overload
    Receiver(double position, double verticalPosition) {
        super(position);
        this.verticalPosition = verticalPosition;
    }
    
    // modifier method
    public void setVerticalPosition(double verticalPosition) {
        this.verticalPosition = verticalPosition;
    }
    
    // accessor method
    public double getVerticalPosition() {
        return verticalPosition;
    }
}