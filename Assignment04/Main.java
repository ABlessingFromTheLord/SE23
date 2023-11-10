package Assignment04;

public class Main {
    public static void main(String[] args) {
        // Example
        Apartment myApartment = new Apartment("Bob the builder's");

        Bathroom bathroom = new Bathroom("Bathroom", false);
        Kitchen kitchen = new Kitchen("Kitchen", false);
        myApartment.addNewRoom(bathroom);
        myApartment.addNewRoom(kitchen);

        myApartment.enter();

    }
}
