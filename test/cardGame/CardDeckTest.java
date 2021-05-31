package cardGame;

import cardGame.Exception.InvalidCardValueException;
import cardGame.Exception.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    private CardDeck cardDeck;

    @BeforeEach
    void setUp() {
        cardDeck = new CardDeck(6);
    }

    @Test
    void testThatCardDeckHasAFixedSize() {
        assertEquals(6, cardDeck.getSize());
    }

    @Test
    void pushOnce_confirmThatCardPushedLastIsAtTop() {
        Card card = Card.createCircleCardOfValue(2);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }

    @Test
    void pushTwice_popAndConfirmThatCardPushedLastIsAtTop() {
        Card firstCard = Card.createStarCardOfValue(2);
        Card secondCard = Card.createCircleCardOfValue(2);

        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        Card poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, cardDeck.peek());
    }

    @Test
    void testThatIfDeckIsEmpty_popWillThrowStackUnderflowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderflowException.class, ()->cardDeck.pop());
    }

    @Test
    void testThatIfDeckIsEmpty_peekWillThrowStackUnderflowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderflowException.class, ()->cardDeck.peek());
    }

    @Test
    void testThatIfDeckIsFull_pushWillThrowStackOverflowException() {
        Card card = Card.createCircleCardOfValue(2);
        for (int i = 0; i < 6; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(InvalidCardValueException.StackOverflowException.class, ()->cardDeck.push(card));
    }
    @Test
    void testToCreateFullCardDeck(){
//        CardDeck cardDeck = new CardDeck(54);
        CardDeck.createFullCardDeck();
        assertTrue(cardDeck.isFull());

    }
}


