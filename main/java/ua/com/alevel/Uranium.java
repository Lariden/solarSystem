package ua.com.alevel;

public class Uranium extends Planets {
    @Override
    public void acceleration() {
        name = "uranium";
        weight = "86.05440 * (10 в 24 степени)";
        radius = "26.500 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 9;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
