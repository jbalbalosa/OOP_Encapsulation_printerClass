package jeff.balbalosa;

public class Printer {
    private double tonerLevel;
    private int pagePrinted;
    private boolean duplexPrinter = true;

    public Printer(int ink, int page, boolean duplex) {
        this.tonerLevel = ink;
        if (ink <= 0){
            System.out.println("Please refill the toner");
        }
        this.pagePrinted = page;
        this.duplexPrinter = duplex;
    }

    public void refill(int level){
        this.tonerLevel += level;
        if ((this.tonerLevel) > 100) {
            this.tonerLevel = 100;
        }
    }

    public void print(int pages){
        if (this.tonerLevel > 0 ){
            this.pagePrinted += pages;
            this.tonerLevel -= (pages / 100);
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean getDuplexPrinter() {
        return duplexPrinter;
    }
}
