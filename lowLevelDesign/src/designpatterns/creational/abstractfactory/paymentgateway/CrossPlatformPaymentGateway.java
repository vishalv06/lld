package designpatterns.creational.abstractfactory.paymentgateway;

public class CrossPlatformPaymentGateway {

    public interface TaxCalculator {
        double calculateTax(double amount);
    }

    public interface PaymentProcessor {
        void processPayment(double amount);
    }

    public interface PaymentGatewayFactory {
        TaxCalculator createTaxCalculator();
        PaymentProcessor createPaymentProcessor();
    }

    public static class IndianTaxCalculator implements TaxCalculator {
        @Override
        public double calculateTax(double amount) {
            return amount * 0.18;
        }
    }
    public static class UPIPaymentProcessor implements PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing ₹ " + amount + " via UPI");
        }
    }

    public static class USTaxCalculator implements TaxCalculator {
        @Override
        public double calculateTax(double amount) {
            return amount * 0.08;
        }
    }

    public static class StripePaymentProcessor implements PaymentProcessor {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing $ " + amount + " via Stripe");
        }
    }

    public static class IndiaGatewayFactory implements PaymentGatewayFactory {
        @Override
        public TaxCalculator createTaxCalculator() {
            return new IndianTaxCalculator();
        }

        @Override
        public PaymentProcessor createPaymentProcessor() {
            return new UPIPaymentProcessor();
        }
    }

    public static class USGatewayFactory implements PaymentGatewayFactory {

        @Override
        public TaxCalculator createTaxCalculator() {
            return new USTaxCalculator() ;
        }

        @Override
        public PaymentProcessor createPaymentProcessor() {
            return new StripePaymentProcessor();
        }
    }

    public static void main(String[] args) {
        PaymentGatewayFactory paymentGatewayFactory = new IndiaGatewayFactory();
        TaxCalculator taxCalculator = paymentGatewayFactory.createTaxCalculator();
        PaymentProcessor paymentProcessor = paymentGatewayFactory.createPaymentProcessor();
        double tax = taxCalculator.calculateTax(1000);
        paymentProcessor.processPayment(1000 + tax);
    }

}
