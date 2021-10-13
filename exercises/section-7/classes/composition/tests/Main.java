package classes.composition.tests;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 7);
        Case aCase = new Case("Unknown", "Unknown", "220", dimensions);
        Monitor monitor = new Monitor("24 inches monitor", "Unknown", 24.0, new Resolution(1920, 1080));
        MotherBoard motherBoard = new MotherBoard("B410", "Unknown", "Version 1.9", 4, 6);

        PC pc = new PC(aCase, monitor, motherBoard);
        pc.getPcCase().pressPowerButton();
        pc.getPcMonitor().drawPixelAt(100, 50, "Black");
        pc.getPcMotherBoard().loadProgram("Eclipse");

    }

}
