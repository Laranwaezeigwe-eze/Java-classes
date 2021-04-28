package chapterTen;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4,"Car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Benz benz = new Benz(4,"4matic");
        System.out.println(benz.startEngine());
        System.out.println(benz.accelerate());
        System.out.println(benz.brake());

        Toyota toyota = new Toyota(6,"Venza");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Ford ford = new Ford(2,"Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());



    }


}
