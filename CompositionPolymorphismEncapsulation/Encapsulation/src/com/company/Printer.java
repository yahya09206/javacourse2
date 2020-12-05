package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillUp(int fill){
        if (fill > 0 && fill <= 100){
            if (this.tonerLevel + fill > 100){
                return -1;
            }
            this.tonerLevel += fill;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplexPrinter){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex....");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
