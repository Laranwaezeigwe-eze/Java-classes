package cardGame;

import cardGame.Exception.InvalidCardValueException;

import static cardGame.Suit.*;

public class Card {
    private final int value;
    private final Suit suit;

    private Card(Suit suit, int value) {

        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit(){
    return suit;
}
    @Override
    public String toString(){
        return  "Card value " + value + "\n" + "Card suit " + suit;
    }
    public  static Card createCircleCardOfValue(int value){
        Card card = new Card(CIRCLE, 2);
        return card;
    }
    public  static Card createTriangleCardOfValue(int value){
        Card card = new Card(TRIANGLE, 2);
        return card;
    }
    public  static Card createCrossCardOfValue(int value){
        Card card = new Card(CROSS, 2);
        return card;
    }
    public  static Card createSquareCardOfValue(int value){
        Card card = new Card(SQUARE, 2);
        return card;
    }
    public  static Card createStarCardOfValue(int value){
        Card card = new Card(STAR, 2);
        return card;
    }
    public  static Card createWhotCardOfValue(int value){
        Card card = new Card(WHOT, 20);
        return card;
    }
}

