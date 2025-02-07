package com.mhrglobal.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingServicePaymentServiceTest {

    @Test
    public void testPayment() {
        PaymentService paymentService = new CardPaymentService();
        assertTrue(paymentService.requestPayment(3f), "Test the card payment service");
    }

}