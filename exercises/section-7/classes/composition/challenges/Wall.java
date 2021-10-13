package classes.composition.challenges;

public class Wall {
    private int width;
    private int height;
    private String color;

    public Wall(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    private String getColor() {
        return this.color;
    }

    public void wallColour(){
        System.out.println("The wall colour is " + this.getColor() + ".");
    }
}
