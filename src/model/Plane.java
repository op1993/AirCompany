package model;

/**
 * Created by Oleh on 11.09.2016.
 */
public class Plane {
    String planeName;
    float cargoCapacity, capacity, distance;


    public Plane() {
    }

    public Plane(String planeName, float cargoCapacity, float distance) {
        this.planeName = planeName;
        this.cargoCapacity = cargoCapacity;
        this.distance = distance;
    }

    public float getCapacity() {
        return capacity;
    }

    public String planeInfo(){
       return "plane name = " + planeName + "\n cargoCapacity =  "  + cargoCapacity + " \n distance =  "+ distance + " \n" ;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public float getDistance() {
        return distance;
    }


}
