package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public final class AccelerationUtil {

    public  void freeFallAcceleration(){
        List<Planets> planets = new ArrayList<>();
        planets.add(new Mercury());
        planets.add(new Venus());
        planets.add(new Earth());
        planets.add(new Mars());
        planets.add(new Jupiter());
        planets.add(new Saturn());
        planets.add(new Uranium());
        planets.add(new Neptune());
        planets.forEach(PlanetAcceleration::acceleration);


    }

}
