package classes.composition.challenges;

public class Door {
    private int height;
    private int width;
    private String colour;
    private boolean isOpen;

    public Door(int height, int width, String colour, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.colour = colour;
        this.isOpen = isOpen;
    }

    private boolean isOpen() {
        return this.isOpen;
    }

    public void openDoor(){
        if(this.isOpen()){
            System.out.println("Door is already opened, you can get in.");

        }else{
            System.out.println("Door opened, getting in.");
            this.isOpen = true;
        }
    }

    public void closeDoor(){
        if(!this.isOpen()){
            System.out.println("Door is already closed.");
        }else{
            System.out.println("Door closed.");
        }
    }
}
