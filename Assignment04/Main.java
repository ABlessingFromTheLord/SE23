package Assignment04;

public class Main {
    public static void main(String[] args) {
        // Example
        Apartment myApartment = new Apartment("Bob the builder's");

        Room entrance = new Room("Hallway", false);
        Bathroom bathroom = new Bathroom("Bathroom", false);
        Kitchen kitchen = new Kitchen("Kitchen", false);

        // Setting neighbors
        entrance.setNeighbors(bathroom);
        entrance.setNeighbors(kitchen);
        

        // Adding rooms into apartment
        myApartment.addNewRoom(entrance);
        myApartment.addNewRoom(bathroom);
        myApartment.addNewRoom(kitchen);

        myApartment.enter();

    }
}
