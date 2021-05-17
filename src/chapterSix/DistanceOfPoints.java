package chapterSix;

import java.util.Scanner;

public class DistanceOfPoints {

    public double distance(double x1, double y1, double x2, double y2){


        double pointX = (x1 - x2) * (x1 - x2);
        double pointY = (y1 - y2) * (y1 - y2);

        return Math.sqrt(pointX + pointY);
    }

    public static void main(String[] args) {
        DistanceOfPoints dis = new DistanceOfPoints();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinate point x1: ");
        double coordinate_x1 = input.nextDouble();

        System.out.println("Enter coordinate point x2: ");
        double coordinate_x2 = input.nextDouble();

        System.out.println("Enter coordinate point y1: ");
        double coordinate_y1 = input.nextDouble();

        System.out.println("Enter coordinate point y2: ");
        double coordinate_y2 = input.nextDouble();

        System.out.printf("Coordinate is %f%n", dis.distance(coordinate_x1, coordinate_y1, coordinate_x2, coordinate_y2));

    }
}
