
package com28minutes.opps;

public class Moterbikerunner {
    public static void main (String[] args){
        Moterbike ducati = new Moterbike();
        Moterbike honda = new Moterbike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        int ducatiSpeed = ducati.getSpeed();//get ducati speed
        ducatiSpeed = ducatiSpeed + 100 ;//icreased it by 100
        ducati.setSpeed(ducatiSpeed); //set it to ducati

        int hondaSpeed = honda.getSpeed();
        hondaSpeed = hondaSpeed + 100;
        honda.setSpeed(hondaSpeed);

        System.out.println(ducati.getSpeed());
        //honda.setSpeed(80);
        System.out.println(honda.getSpeed());
    }
}
