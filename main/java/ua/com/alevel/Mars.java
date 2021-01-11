package ua.com.alevel;

public class Mars extends Planets {


    @Override
    public void acceleration() {
        name = "mars";
        weight = "6.4169 * (10 в 24 степени)";
        radius = "3.488 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 3.7;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
