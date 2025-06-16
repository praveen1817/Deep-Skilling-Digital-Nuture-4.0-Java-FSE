public class testPaymant {
    public static void main(String[] args) {
        paymentProcessor gpay=new gpayAdaptee(new gpayGateway());
        gpay.processPayment(1000);
        paymentProcessor phonepay=new phonePayAdaptee(new phonepayGateway());
        phonepay.processPayment(600);
        paymentProcessor paypal= new paypalAdaptee(new paypalGateway());
        paypal.processPayment(100);
    }
}
