package Task3;
import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;  // Collection of rooms
    private int numberOfFloors;
    private String hint;       // Optional field for hint or description

    // 3.e Constructor to initialize the fields
    public Building(ArrayList<Room> rooms, int numberOfFloors, String hint) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
        this.hint = hint;
    }

    // 3.f Getters and setters for rooms, numberOfFloors, and hint
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
