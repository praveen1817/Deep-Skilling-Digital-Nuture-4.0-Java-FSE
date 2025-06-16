public class gpayAdaptee implements paymentProcessor{
    private gpayGateway gpaypayment;
    public gpayAdaptee( gpayGateway gpaypayment){
        this.gpaypayment=gpaypayment;
    }

    @Override
    public void processPayment(double amount) {
        gpaypayment.sendPayment(amount);
    }
}
