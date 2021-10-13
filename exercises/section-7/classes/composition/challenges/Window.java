package classes.composition.challenges;

public class Window {
    private int height;
    private int width;
    private boolean isOpen;

    public Window(int height, int width, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.isOpen = isOpen;
    }

    private boolean isOpen() {
        return this.isOpen;
    }

    public void closeWindow(){
        if(this.isOpen()){
            System.out.println("The window is already closed.");
        }else{
            this.isOpen = true;
            System.out.println("The window is closed.");
        }
    }

    public void openWindow(){
        if(this.isOpen()){
            System.out.println("The window is already opened.");
        }else{
            this.isOpen = true;
            System.out.println("The window is opened.");
        }
    }
}
