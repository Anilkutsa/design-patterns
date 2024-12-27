package org.designpatterns.behavioural.StrategyPattern;

/**
 * Use the Strategy Pattern
 *  - When you need to define a family of algorithms,
 *  - Make them interchangeable
 *  - Let the client choose the behavior at runtime.
 *
 *  It’s ideal for scenarios with varying algorithms,
 *  avoiding conditional logic (if-else),
 *  or when you want to add new behaviors without modifying existing code.
 *
 *  Examples include payment methods, compression techniques, or sorting algorithms.
 *
 *  With the Strategy Pattern, the logic for each payment type is
 *  encapsulated in separate strategy classes, and the PaymentService
 *  (context class) delegates the task of payment processing to one of
 *  these strategies at runtime.
 */

interface PaymentStrategy{
    void processPayment();
}

//Concrete Strategy: Credit Card
class CreditCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit Card");
    }
}

//Concrete Strategy: Debit Card
class DebitCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Debit Card");
    }
}

//Concrete Strategy: UPI
class UPIPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via UPI");
    }
}

// Service class for setting the strategy and making the payment
class PaymentServiceII{
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
        strategy.processPayment(); //Polymorphic Behaviour
    }

}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentServiceII paymentService = new PaymentServiceII();
        paymentService.setPaymentStrategy(new UPIPayment());
        paymentService.pay();
    }
}
