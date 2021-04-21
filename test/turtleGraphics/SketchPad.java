package turtleGraphics;

public class SketchPad {
    private  final  int[][]floor;

    public  SketchPad(int numberOfRows, int numberOfColumn){
        floor = new int [numberOfRows][numberOfColumn];
    }

    public int[][] getFloor() {
        return floor;
    }
}
