package classes.composition.tests;

public class PC {
    private Case pcCase;
    private Monitor pcMonitor;
    private MotherBoard pcMotherBoard;

    public PC(Case pcCase, Monitor pcMonitor, MotherBoard pcMotherBoard) {
        this.pcCase = pcCase;
        this.pcMonitor = pcMonitor;
        this.pcMotherBoard = pcMotherBoard;
    }

    public Case getPcCase() {
        return pcCase;
    }

    public Monitor getPcMonitor() {
        return pcMonitor;
    }

    public MotherBoard getPcMotherBoard() {
        return pcMotherBoard;
    }
}
