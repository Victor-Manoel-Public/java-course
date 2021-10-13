package classes.composition.challenges;

/**
 * Create a single room of a house using composition.
 * Think about the things that should be included in the room.
 * Maybe physical parts of the house but furniture as well
 * Add at least one method to access an object via a getter and
 * then that objects public method as you saw in the previous video
 * then add at least one method to hide the object e.g. not using a getter
 * but to access the object used in composition within the main class
 */

public class Main {
    public static void main(String[] args) {
        Door door = new Door(180, 60, "Dark Yellow", false);
        Window window = new Window(120, 120, false);
        Wall wall = new Wall(420, 400, "White");

        BedRoom bedRoom = new BedRoom(wall, door, window);

        bedRoom.getIn();
        bedRoom.openWindow();
        bedRoom.openWindow();
        bedRoom.closeDoor();
        bedRoom.wallColor();
        bedRoom.closeWindow();
        bedRoom.closeWindow();

    }
}
