package com.mhrglobal.payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Do not change
public class CardPaymentService implements PaymentService{

    Logger logger = LoggerFactory.getLogger(CardPaymentService.class);

    @Override
    public boolean requestPayment(float amount) {
        //No need to implement
        logger.info("Payment called, amount: £{}", amount);
        return true;
    }
}
