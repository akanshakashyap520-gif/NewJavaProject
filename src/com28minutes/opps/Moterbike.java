package com28minutes.opps;

public class Moterbike {
    //state
    private int speed; //member variable

    //behavour
    //method
    //input int speed
    //output void
    //name setspeed

    void setSpeed(int speed){

        System.out.println(this.speed);
        this.speed = speed;
        //System.out.println(speed);

    }

    int getSpeed(){
        return this.speed;
    }

    void start(){
        System.out.println("Bike Started");
    };

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }



}
