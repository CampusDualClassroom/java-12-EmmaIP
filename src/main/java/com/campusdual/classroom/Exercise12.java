package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Yaris", "Diésel");

        myCar.isTachometerEqualToZero();

        myCar.start();
        myCar.start();

        myCar.stop();
        myCar.accelerate();

        myCar.start();
        myCar.accelerate();

        myCar.speedometer = 120;
        myCar.accelerate();

        myCar.brake();
        myCar.speedometer = 0;
        myCar.brake();

        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(-56);

        myCar.setReverse(true);




    }

}