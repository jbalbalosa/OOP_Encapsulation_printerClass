package jeff.balbalosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("OOP Encapsulation");
        System.out.println("------------------------------------");
        System.out.println("");

        Printer printer = new Printer(100, 0, true);
        printer.print(571);

        System.out.println("Toner level: %" + printer.getTonerLevel());
        System.out.println("Number of pages printed: " + printer.getPagePrinted());
        System.out.println("Duplex: " + printer.getDuplexPrinter());

        System.out.println("Refill toner");
        printer.refill(25);
        System.out.println("Toner level: %" + printer.getTonerLevel());
    }
}