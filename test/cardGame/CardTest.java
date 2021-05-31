package cardGame;

import cardGame.Exception.InvalidCardValueException;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    void circleSuitCanBeCreated(){
       Card card =  Card.createCircleCardOfValue(2);
        assertSame(CIRCLE,card.getSuit()) ;
    }

    @Test
    void triangleSuitCanBeCreated(){
        Card card = Card.createTriangleCardOfValue(2);
        assertSame(TRIANGLE, card.getSuit());
    }

    @Test
    void crossSuitCanBeCreated(){
        Card card = Card.createCrossCardOfValue(3);
        assertSame(CROSS, card.getSuit());
    }

    @Test
    void squareSuitCanBeCreated(){
        Card card = Card.createSquareCardOfValue(2);
        assertSame(SQUARE, card.getSuit());
    }
    @Test
    void starSuitCanBeCreated(){
        Card card = Card.createStarCardOfValue(2);
        assertSame(STAR, card.getSuit());
    }

    @Test
    void whotSuitCanBeCreated(){
        Card card = Card.createWhotCardOfValue(20);
        assertSame(WHOT, card.getSuit());
    }

//    @Test
//    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
//        assertThrows(InvalidCardValueException.class,()-> Card.createCrossCardOfValue(4));
//    }



}
