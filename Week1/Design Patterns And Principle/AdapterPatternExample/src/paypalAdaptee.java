public class paypalAdaptee implements paymentProcessor{
    private paypalGateway paypalPayment;
    public paypalAdaptee(paypalGateway paypalPayment){
        this.paypalPayment=paypalPayment;
    }

    @Override
    public void processPayment(double amount) {
        paypalPayment.transferPayment(amount);
    }
}
