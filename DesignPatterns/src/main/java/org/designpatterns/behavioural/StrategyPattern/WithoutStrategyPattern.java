package org.designpatterns.behavioural.StrategyPattern;

/**
 * Let's consider a simple payment system where users can pay
 * using different methods like credit cards or PayPal.
 *
 * Without the Strategy Pattern, you might use if-else conditions
 * to handle the different payment methods, leading to less
 * maintainable and flexible code.
 *
 * We should use the Strategy Pattern because it:
 * - Encapsulates Algorithms: Allows defining multiple algorithms or behaviors and switching between them dynamically at runtime.
 * - Avoids Conditional Logic: Eliminates complex if-else or switch statements by delegating behavior to strategy classes.
 * - Promotes Open/Closed Principle: Enables adding new strategies without modifying existing code, making the system more extensible.
 * - Supports Reusability: Strategies can be reused across different parts of the application.
 *
 */

class PaymentService{
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("Credit Card")){
            System.out.println("Making payment via credit card");
        }
        else if(paymentMethod.equals("Debit Card")){
            System.out.println("Making payment via debit card");
        }
        else if(paymentMethod.equals("UPI")){
            //huge algorithm
            System.out.println("Making payment via UPI");
        }
        else{
            System.out.println("Unsupported Payment method");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("UPI");
    }
}
