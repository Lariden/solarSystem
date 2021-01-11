package ua.com.alevel;

public class Venus  extends Planets{
    @Override
    public void acceleration() {
        name = "venus";
        weight = "4.81068 * (10 в 24 степени)";
        radius = "6.052 * (10 в 6 степени)" ;
        gravity = "6.674 * (10 в -11 степени)";
        accelerationOfGravity = 8.9;
        System.out.println();
        System.out.println("Планета - "+name+", Масса = "+weight+", Радиус = "+radius+", Гравитация = "+gravity+"\nУскорение свабодного падения = "+accelerationOfGravity);

    }
}
