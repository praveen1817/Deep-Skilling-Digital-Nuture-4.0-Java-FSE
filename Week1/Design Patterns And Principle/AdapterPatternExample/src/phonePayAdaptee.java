public class phonePayAdaptee implements paymentProcessor{
    private phonepayGateway phonepayPayment;
    public phonePayAdaptee(phonepayGateway phonepayPayment){
        this.phonepayPayment=phonepayPayment;
    }

    @Override
    public void processPayment(double amount) {
        phonepayPayment.makePayment(amount);
    }
}
