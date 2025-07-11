package solid.isp;

public class Printer {

    interface Printable {
        public void print();
    }

    interface Scannable {
        public void scan();
    }

    interface Faxable {
        public void fax();
    }

    static class SimplePrinter implements Printable {

        @Override
        public void print() {
            System.out.println("Simple printer is printing");
        }
    }

    static class AdvancedPrinter implements Printable, Scannable, Faxable {

        @Override
        public void print() {
            System.out.println("Advance Printer is printing");
        }

        @Override
        public void fax() {
            System.out.println("Advance printer is faxing");
        }

        @Override
        public void scan() {
            System.out.println("Advance printer is scanning");
        }
    }

    public static void main(String[] args) {
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.fax();
        advancedPrinter.scan();
    }
}
