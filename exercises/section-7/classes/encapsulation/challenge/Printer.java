package classes.encapsulation.challenge;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel: -1;
        this.duplex = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }

    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
