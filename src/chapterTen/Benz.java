package chapterTen;

public class Benz extends Car{

        public Benz(int cylinders, String name) {
            super(cylinders, name);
        }
        @Override
        public  String startEngine(){
            return "Benz->startEngine()";
        }
        @Override
        public  String accelerate(){
            return "Benz->accelerate()";
        }
        @Override
        public  String brake(){
            return "Benz->brake()";
        }

    }


