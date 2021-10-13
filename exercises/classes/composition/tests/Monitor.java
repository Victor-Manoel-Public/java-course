package classes.composition.tests;

public class Monitor {
    private String model;
    private String manufacturer;
    private double size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, double size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.printf("Drawing pixel %d, %d at colour %s.\n", x, y, colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
