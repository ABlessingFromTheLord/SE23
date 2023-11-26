package Assignment06;

public class Drone {
    // Fields
    private boolean on;
    private boolean generatingRoute;
    private boolean flyingPath;
    private boolean trackingPerson;
    private State currentState;

    // Constructor
    public Drone(){
        // starting drone on the drone pad
        on = true;
        currentState = new OnDronePad();
    }

    // Methods
    // Getters
    public boolean isOn() {
        return on;
    }

    public boolean isGeneratingRoute() {
        return generatingRoute;
    }

    public boolean isFlyingPath() {
        return flyingPath;
    }

    public boolean isTrackingPerson() {
        return trackingPerson;
    }

    public State getCurrentState(){
        return currentState;
    }

    // Setters
    public void setOn(boolean on) {
        this.on = on;
    }

    public void setGeneratingRoute(boolean generatingRoute) {
        this.generatingRoute = generatingRoute;
    }

    public void setFlyingPath(boolean flyingPath) {
        this.flyingPath = flyingPath;
    }
    public void setTrackingPerson(boolean trackingPerson) {
        this.trackingPerson = trackingPerson;
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    // Action Methods
    public void onStart(){
        System.out.println("Current state " + this.getCurrentState());
        this.getCurrentState().enterState();
    }

    public void turnOn(){

    }

    public void turnOff(){

    }

    public void generateRoute(){

    }

    public void abortPathPlanning(){

    }

    public void flyPath(){

    }

    public void trackingPerson(){

    }

    public void returnToBase(){

    }

    public void landing(){

    }

    // decide what to do
    public void processInput(){
        while(on){

        }

        System.out.println("Drone has finished its work");
    }





}
