package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    // 3.b Constructor to initialize the fields
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // 3.c Getters and setters for numberOfLamps and numberOfWindows
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
