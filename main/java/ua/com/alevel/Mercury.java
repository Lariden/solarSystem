package ua.com.alevel;

public class Mercury extends Planets {
    @Override
    public void acceleration() {
        name = "mercury";
        weight = "0.32868 * (10 в 24 степени)";
        radius = "2.439  * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 3.7;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
