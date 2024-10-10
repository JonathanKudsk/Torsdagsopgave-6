package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g Instantiate at least three different rooms
        Room room1 = new Room(3, 2);
        Room room2 = new Room(2, 3);
        Room room3 = new Room(4, 1);

        // 3.h Add the three rooms to a collection (ArrayList in this case)
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i Instantiate a new building with the rooms created above
        Building building = new Building(rooms, 2, "Office building");

        // Test countLampsInBuilding and isNormal methods
        System.out.println("Total lamps in the building: " + countLampsInBuilding(building));
        System.out.println("Total windows in the building: " + countWindowsInBuilding(  building));
        System.out.println("Total rooms in the building: " + countRoomsInBuilding(building));
        System.out.println("Is the building normal? " + isNormal(building));
    }

    // 3.j Method to count total lamps in the building
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // Additional method to count total rooms in the building
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    // Additional method to count total windows in the building
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // 3.k Method to check if the building is normal (number of floors >= number of rooms)
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}
