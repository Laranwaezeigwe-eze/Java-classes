package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;

        System.out.println("Enter radius of circle: ");
        r = input.nextInt();

        int diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.printf("Diameter is %d\nThe circumference is %2f\nThe area is %2f",diameter,circumference,area);






    }
}
