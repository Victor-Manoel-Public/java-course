package classes.composition.challenges;

public class BedRoom {
    private Wall wall;
    private Door door;
    private Window window;

    public BedRoom(Wall wall, Door door, Window window) {
        this.wall = wall;
        this.door = door;
        this.window = window;
    }

    public Wall getWall() {
        return wall;
    }

    public void getIn(){
        door.openDoor();
    }

    public void openWindow(){
        window.openWindow();
    }
    public void closeDoor(){
        door.closeDoor();
    }

    public void wallColor(){
        wall.wallColour();
    }

    public void closeWindow(){
        window.closeWindow();
    }
}
