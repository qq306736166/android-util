package com.app.taobaopay.controller;

import android.text.method.Touch;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class UDPController extends Socket {

    private final DatagramSocket socket = null;
    private final int port = 5960;
    private DatagramPacket datagramPacket;
    private final boolean isRunning = true;
    private static UDPController udpController;

    private static UDPController getInstance() {
        if (udpController == null) {
            synchronized (UDPController.class){
                udpController = new UDPController();
            }
        }
        return udpController;
    }

    private void UdpInit(int port, Touch touch){

    }
}
