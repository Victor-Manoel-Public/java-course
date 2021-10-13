package classes.encapsulation.challenge;

public class Main {
    // Create a class named Printer
    // It will simulate a computer printer
    // It should have 2 fields for the toner level, number of pages printed, and
    // also whether it's a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and everything else you think is needed

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count=" + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("PAges printed was=" + pagesPrinted + " new total=" + printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPages(6);
        System.out.println("PAges printed was=" + pagesPrinted + " new total=" + printer.getNumberOfPagesPrinted());
    }
}
