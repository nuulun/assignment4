package project;





public class Main {





    public static void main(String[] args) {
        City city = new City("Springfield");

        Building building1 = new Building("Main Street", "101", 20.5);
        Building building2 = new Building("Elm Street", "202", 18.0);

        city.addBuilding(building1);
        city.addBuilding(building2);

        Room room1 = new Room(1, 50.0, building1);
        Room room2 = new Room(2, 75.0, building1);
        Room room3 = new Room(1, 60.0, building2);

        building1.addRoom(room1);
        building1.addRoom(room2);
        building2.addRoom(room3);

        System.out.println("Building 1:");
        System.out.println("Street: " + building1.getStreetName());
        System.out.println("House Number: " + building1.getHouseNumber());
        System.out.println("Monthly Payment per sq.m: " + building1.getBasicMonthlyPaymentPerSqM());
        System.out.println("Total Area: " + building1.getTotalArea());

        System.out.println("Rooms in Building 1:");
        for (Room room : building1.getRooms()) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Area: " + room.getArea());
        }

        Building foundBuilding = city.findBuilding("Main Street", "11");
        if (foundBuilding != null) {
            System.out.println("\nFound Building:");
            System.out.println("Street: " + foundBuilding.getStreetName());
            System.out.println("House Number: " + foundBuilding.getHouseNumber());
            System.out.println("Monthly Payment per sq.m: " + foundBuilding.getBasicMonthlyPaymentPerSqM());
        } else {
            System.out.println("Building not found.");
        }
    }
}

