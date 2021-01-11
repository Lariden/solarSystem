package ua.com.alevel;

public class Saturn extends Planets {
    @Override
    public void acceleration() {
        name = "saturn";
        weight = "561.80376 * (10 в 24 степени)";
        radius = "60.100 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 11.3;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
