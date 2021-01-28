package es.florida;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class DronController {
    private static final int SERVER = 9876;

    public DronController() throws IOException {
    }

    public Socket connect() throws IOException {
        Socket socketConnection=new Socket();
        socketConnection.connect(new InetSocketAddress(SERVER));
        return socketConnection ;
    }
    Socket socket = this.connect();





    public void takeOff() throws InterruptedException {

        System.out.println("Taking off...");

    }

    public void land() {
        System.out.println("Landing");
    }

    public void firePrimaryCannon() {
        System.out.println("Ratatatatatatata!");
    }

    public void fireSecondaryWeapon() {
        System.out.println("Piñau! Piñau!");
    }

    public void shutDown() {
        System.out.println("Shutting down system...");
    }

}