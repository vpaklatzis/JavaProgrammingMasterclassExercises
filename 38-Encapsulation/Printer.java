public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel <= -1 && tonerLevel > 100) {
            tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        
        this.duplex = duplex;
    }
    
    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
        return tonerLevel;
    }
    
    public int printPages(int pages) {
        int pagesToPrint = pages;
        
        if(duplex) {
           pagesToPrint = (pages / 2) + (pages % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
