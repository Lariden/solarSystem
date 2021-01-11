package ua.com.alevel;

public class Earth extends Planets {


    @Override
    public void acceleration() {
        name = "earth";
        weight ="5,97 * ( 10 в 24 степени )";
        radius = "6.378 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 9.8;
        System.out.println();
        System.out.println("Планета - " + name + ", Масса = " + weight + ", Радиус = " + radius + ", Гравитация = " + gravity + "\nУскорение свабодного падения = " + accelerationOfGravity);
    }
}

