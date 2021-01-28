package es.florida;

import java.io.IOException;

public class DronExecute {

    public static void main(String[] args) throws IOException, InterruptedException {
        DronController dronController = new DronController();


        dronController.takeOff();
        Thread.sleep(1000);
        dronController.firePrimaryCannon();
        Thread.sleep(1000);
        dronController.fireSecondaryWeapon();
        dronController.land();






    }
}