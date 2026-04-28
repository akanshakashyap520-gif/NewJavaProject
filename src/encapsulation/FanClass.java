package encapsulation;

public class FanClass {
    private int speed;
    private boolean isOn;


    void start() {
        System.out.println("Fan Started");
    }

    void turnOn () {
        this.isOn = true;
        System.out.println("Fan is On");
    }

    void turnOff () {
        this.isOn = false;
        System.out.println("Fan is Off");
    }

    boolean isOn(){
        return this.isOn;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }



    static void main(String[] args) {
        FanClass fan1 = new FanClass();
        FanClass fan2 = new FanClass();

        fan1.start();
        fan2.start();

        fan1.turnOff();
        fan2.turnOn();
        fan2.setSpeed(5);
        System.out.println(fan2.getSpeed());
        //System.out.println(fan1.turnOff);



    }


}


