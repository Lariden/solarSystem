package ua.com.alevel;

public class Jupiter extends Planets {
    @Override
    public void acceleration() {
        name = "jupiter";
        weight = "1876.64328 * (10 в 24 степени)" ;
        radius = "71.300  * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 25.8;
        System.out.println();
        System.out.println("Планета - " + name + ", Масса = " + weight + ", Радиус = " + radius + ", Гравитация = " + gravity + "\nУскорение свабодного падения = " + accelerationOfGravity);

    }
}
