package chapter8;

public class Rectangle {
    double length= 1;
    double width= 1;
    public  Rectangle(){

    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    public double getArea(){
        return  length * width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0.0)
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 20.0)
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Perimeter of a rectangle is: " + rectangle.getPerimeter());
        System.out.println("Area of a rectangle is: "+ rectangle.getArea());
    }
}
