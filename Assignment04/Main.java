package Assignment04;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Example
        Apartment myApartment = new Apartment("Bob the builder's");

        Room entrance = new Room("Hallway", false);
        Room bedroom = new Room("Bedroom", false);
        Room balcony = new Room("Balcony", false);
        Bathroom bathroom = new Bathroom("Bathroom", false);
        Kitchen kitchen = new Kitchen("Kitchen", false);
        LivingRoom livingRoom = new LivingRoom("LivingRoom", false);

        // Setting neighbors
        entrance.setNeighbors(bedroom);
        entrance.setNeighbors(balcony);
        entrance.setNeighbors(bathroom);
        entrance.setNeighbors(kitchen);
        entrance.setNeighbors(livingRoom);

        bedroom.setNeighbors(livingRoom);
        bedroom.setNeighbors(kitchen);

        balcony.setNeighbors(livingRoom);
        balcony.setNeighbors(bedroom);

        livingRoom.setNeighbors(bedroom);
        livingRoom.setNeighbors(balcony);

        kitchen.setNeighbors(livingRoom);

        bathroom.setNeighbors(livingRoom);

        // Adding rooms into apartment
        myApartment.addNewRoom(entrance);
        myApartment.addNewRoom(bedroom);
        myApartment.addNewRoom(balcony);
        myApartment.addNewRoom(bathroom);
        myApartment.addNewRoom(kitchen);

        myApartment.enter();

    }
}
