package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.IconUIResource;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {

    Pen pen;
    Pen secondPen;
    Turtle ijapa;

    @BeforeEach
    void startAllTestsWithThis() {
        pen = new Pen();
        secondPen = new Pen();
        ijapa = new Turtle(pen);
    }

    @Test
    void turtleHasAPenTest() {
        Pen pen = new Pen();
        Pen secondPen = new Pen();
        Turtle turtle = new Turtle(pen);

        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(secondPen, turtle.getPen());

    }

    @Test
    void turtleCanMoveThePenUp() {
        //when
        ijapa.movePenUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(ijapa.isPenUp());
//        when
        ijapa.movePenDown();
//        assert
        assertFalse(ijapa.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth() {
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouth() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingSouth() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanMoveForwardFacingWest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanMoveForwardFacingNorth() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());

    }

    @Test
    void turtleCanWriteWhileFacingEastTest(){
        //given
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        //when
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        //assert
        int counter = 0;
        int[][]floor = sketchPad.getFloor();
        while(counter < numberOfSteps){
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0,4),ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingSouthTest(){
        //given
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        //when
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        //assert
        int counter = 0;
        int[][]floor = sketchPad.getFloor();
        while(counter < numberOfSteps){
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0,4),ijapa.getCurrentPosition());

        ijapa.turnRight();
        //when
        ijapa.writeOn(sketchPad, 5);
        numberOfSteps = 5;

        //assert
        counter = 0;
//        floor = sketchPad.getFloor();
        while(counter < numberOfSteps){
            assertEquals(1, floor[counter][4]);
            counter++;
        }
        assertEquals(new Position(4,4),ijapa.getCurrentPosition());

    }
    @Test
    void turtleCanWriteWhileFacingWestTest(){
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        assertEquals(EAST, ijapa.getCurrentDirection());
        int newNumberOfSteps = 5;
        ijapa.writeOn(sketchPad, newNumberOfSteps);
        int counterPlus = 0;
        int [][] theFloor = sketchPad.getFloor();
        while(counterPlus < newNumberOfSteps){
            assertEquals(1, theFloor[0][counterPlus]);
            counterPlus++;
        }
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

        //when
        ijapa.turnRight();
        ijapa.turnRight();
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, numberOfSteps);
        assertEquals(WEST, ijapa.getCurrentDirection());

        //assert
        int counter = 0;
        int[][]floor = sketchPad.getFloor();
        while(counter < numberOfSteps){
            assertEquals(1, floor[0][counter]);
            counter++;
        }
        assertEquals(new Position(0,0),ijapa.getCurrentPosition());

    }
    @Test
    void turtleCanWriteWhileFacingNorthTest() {
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20, 20);
        ijapa.turnRight();
        int newNumberOfSteps = 5;
        ijapa.writeOn(sketchPad, newNumberOfSteps);
        //assert
        int counterIt = 0;
        int[][]floorOn = sketchPad.getFloor();
        while(counterIt < newNumberOfSteps){
            assertEquals(1, floorOn[counterIt][0]);
            counterIt++;
        }
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());


        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        //assert
        int numberOfSteps = 5;
        ijapa.movePenDown();
        ijapa.writeOn(sketchPad, numberOfSteps);

        int counter = 0;
        int[][] floor = sketchPad.getFloor();
        while (counter < numberOfSteps) {
            assertEquals(1, floor[counter][0]);
            counter++;
        }
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());

    }

}
