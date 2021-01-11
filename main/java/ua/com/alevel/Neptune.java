package ua.com.alevel;

public class Neptune extends Planets {
    @Override
    public void acceleration() {
        name = "neptune";
        weight = "101.59200 * (10 в 24 степени)";
        radius = "24.750 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 11.6;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
