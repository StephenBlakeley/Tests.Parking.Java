package com.mhrglobal;

import com.mhrglobal.payment.CardPaymentService;
import com.mhrglobal.payment.PaymentService;
import com.mhrglobal.print.PaperPrintService;
import com.mhrglobal.print.PrintService;

//Implement Parking Service that makes use of the payment and printing services
public class ParkingService {

    PaymentService cardPaymentService = new CardPaymentService();
    PrintService paperPrintService = new PaperPrintService();

}