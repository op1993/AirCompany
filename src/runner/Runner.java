package runner;

import model.Plane;
import service.PlaneCalc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Oleh on 11.09.2016.
 */
public class Runner {

    public static void main(String[] args) {
        boolean repeat = true;
        ArrayList<Plane> planes = new ArrayList<>();

        while (repeat) {
            System.out.println("1 =add plane to the list");
            System.out.println("2  = info");
            System.out.println("3 =  info about total cargo capacity");

            System.out.println("0 = exit");

            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    repeat = false;
                    System.out.println("Completed!");
                    break;

                case 1:
                    System.out.println("Set plane name");
                    String planeName = scanner.next();

                    System.out.println("Set plane capacity");
                    float capacity = scanner.nextFloat();

                    System.out.println("distance");
                    float distance = scanner.nextFloat();

                    planes.add(new Plane(planeName, capacity, distance));
                    break;


                case 2:
                    for (Plane info : planes) {
                        System.out.println(info.planeInfo());
                    }
                    break;
                case 3:

                    PlaneCalc planeCalc = new PlaneCalc(planes);
                    planeCalc.totalCargoCapacity();
                    System.out.println(planeCalc.totalCargoCapacity());

                    System.out.println("Are you finished? Yes or No");
                    String answer;
                    answer = scanner.next();
                    switch (answer) {

                        case "y":
                        case "Y":
                        case "Yes":
                        case "yes":
                            repeat = false;
                            break;

                        case "n":
                        case "N":
                        case "No":
                        case "no":
                            repeat = true;
                            break;
                    }
                    break;
            }

        }
    }
}

