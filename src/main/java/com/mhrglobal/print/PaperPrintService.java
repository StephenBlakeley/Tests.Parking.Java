package com.mhrglobal.print;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Do not change
public class PaperPrintService implements PrintService {

    Logger logger = LoggerFactory.getLogger(PaperPrintService.class);

    @Override
    public void requestPrinting(String vehicleType, String rate, String amount) {
        //No need to implement
        logger.info("Print called, vehicleType: {}, Rate: {}, Amount: £{}", vehicleType, rate, amount);
    }
}
