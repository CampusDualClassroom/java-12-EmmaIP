package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car () {

    }
    public void start() {
        if(this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("El "+ this.brand + " se enciende y el valor del tacómetro es " + this.tachometer);
        } else {
            System.out.println("El "+ this.brand + " ya está encendido");
        }
    }

    public void stop() {
        if(this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("El "+ this.brand + " se ha apagado y el valor del tacómetro es " + this.tachometer);
        } else {
            System.out.println("No se puede apagar el " + this.brand + ", primero tiene que pararse");
        }
    }
    public void accelerate() {
        if (this.tachometer > 0) {
            if(this.speedometer < this.MAX_SPEED)  {
                this.speedometer += 10;
                System.out.println("El " + this.brand + " ha acelerado hasta " + speedometer + " km/h");
            }
            else {
                System.out.println("No es posible acelerar más, el " + this.brand + " ha llegado a su máxima velocidad de "
                        + this.MAX_SPEED + " km/h");
            }
        }
        else {
            System.out.println("El " + this.brand + " está apagado, no es posible acelerarlo");
        }
    }
    public void brake() {
        if (this.tachometer > 0) {
            if (this.speedometer > 0) {
                this.speedometer-= 10;
                System.out.println("El " + this.brand + " ha frenado hasta " + this.speedometer + " km/h");
            }
            else {
                System.out.println("No es posible frenar más, su velocidad ya es " + this.speedometer + " km/h");
            }
        }
        else {
            System.out.println("El " + this.brand + " está apagado, no puede frenar");
        }

    }
    public void turnAngleOfWheels(int angle) {
        if (this.tachometer > 0) {
            if (this.wheelsAngle <= 45 && this.wheelsAngle >= -45) {
                if (this.wheelsAngle + angle < 45 && this.wheelsAngle + angle > -45) {
                    this.wheelsAngle = this.wheelsAngle + angle;
                    System.out.println("El volante se ha girado " + this.wheelsAngle + " grados");
                }
                else {
                    if(angle > 0) {
                        this.wheelsAngle = 45;
                    }
                    else {
                        this.wheelsAngle = -45;
                    }
                    System.out.println("No se puede girar el volante más de 45 o -45 grados");
                }
            }
            else {
                System.out.println("No se puede girar el volante más");
            }
        }
        else {
            System.out.println("El " + this.brand + " está apagado, no puede girar el volante");
        }
    }


    public void setReverse(boolean reverse) {
        if(this.tachometer > 0) {
            if(this.speedometer == 0) {
                this.reverse = reverse;
                this.gear = "R";
                System.out.println("El " + this.brand + " acaba de poner la marcha atrás");
            }
            else {
                System.out.println("El " + this.brand + " debe detenerse antes de poner la marcha atrás");
            }
        }
        else {
            System.out.println("El " + this.brand + " está apagado, no puede poner la marcha atrás");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return true;
    }

    public boolean isTachometerEqualToZero() {
        if(this.tachometer == 0) {
            System.out.println("El valor del tacómetro es: " + this.tachometer);
            return true;
        } else {
            System.out.println("El valor del tacómetro es: " + this.tachometer);
            return false;
        }
    }
}
