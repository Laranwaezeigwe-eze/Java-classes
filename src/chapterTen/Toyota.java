package chapterTen;

public class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public  String startEngine(){
        return "Toyota->startEngine()";
    }
    @Override
    public  String accelerate(){
        return  "Toyota->accelerate()";
    }
    @Override
    public  String brake(){
        return "Toyota->brake()";
    }


}
