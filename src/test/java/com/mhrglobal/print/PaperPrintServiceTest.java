package com.mhrglobal.print;

import org.junit.jupiter.api.Test;

class PaperPrintServiceTest {

    @Test
    public void testPrint() {
        PrintService paperPrintService = new PaperPrintService();
        paperPrintService.requestPrinting("Motorbike", "x0.5", "3.00");
        paperPrintService.requestPrinting("Car","x1", "3.00");
        paperPrintService.requestPrinting("Van","x2", "3.00");
    }

}