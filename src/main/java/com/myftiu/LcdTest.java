package com.myftiu;

import com.myftiu.io.Lcd;
import com.myftiu.io.LcdPlate;
import com.pi4j.io.i2c.I2CFactory;

import java.io.IOException;

public class LcdTest {

    static final int BUS_NO = 1;
    static final int BUS_ADDRESS = 0x20;

    public static void main(String... args) throws IOException, I2CFactory.UnsupportedBusNumberException, InterruptedException {

        Lcd lcd = new LcdPlate(BUS_NO, BUS_ADDRESS);
        lcd.write("Hello World!");
        Thread.sleep(6000);
        lcd.shutdown();

    }

}
