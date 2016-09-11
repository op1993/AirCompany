package service;

import model.Plane;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Oleh on 11.09.2016.
 */
public class PlaneCalc {
    ArrayList<Plane> planes = new ArrayList<>();

    public PlaneCalc(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public float totalCargoCapacity() {
        float totalCargoCapacity = 0;
        Iterator<Plane> planesIterator = planes.iterator();
        while (planesIterator.hasNext()) {
            totalCargoCapacity += planesIterator.next().getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    public float totalCapacity (){
        float totalCapacity = 0;
        Iterator<Plane> planesIterator = planes.iterator();
        while (planesIterator.hasNext()) {
            totalCapacity += planesIterator.next().getCapacity();
        }
        return totalCapacity;

    }
}
