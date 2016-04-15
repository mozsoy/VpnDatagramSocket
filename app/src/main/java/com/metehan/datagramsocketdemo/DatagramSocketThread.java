package com.metehan.datagramsocketdemo;

/**
 * Created by metehan on 4/14/2016.
 */
public class DatagramSocketThread extends Thread {
    public void run(){
        DatagramTest test = new DatagramTest();
        try {
            test.testDatagram();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
