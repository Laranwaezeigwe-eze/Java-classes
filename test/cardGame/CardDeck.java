package cardGame;

import cardGame.Exception.InvalidCardValueException;
import cardGame.Exception.StackUnderflowException;
import chapterTen.Car;

import java.security.SecureRandom;

public class CardDeck {

    private static Card[] cards;
    private static int lastPushedLocation = -1;

    public CardDeck(int numberOfCards) {
        cards = new Card[numberOfCards];
    }

    public static int getSize() {
        return cards.length;
    }

    public static void push(Card card) {
        if (isFull()) {
            throw new InvalidCardValueException.StackOverflowException("Card deck is full!");
        }
        lastPushedLocation++;
        cards[lastPushedLocation] = card;
    }

    public Card peek() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty!");

        return cards[lastPushedLocation];
    }

    public Card pop() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty!");

        return cards[lastPushedLocation--];
    }

    public boolean isEmpty() {
        if (lastPushedLocation == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFull() {
        if (lastPushedLocation == getSize() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void shuffle() {
        SecureRandom randomizer = new SecureRandom();
        Card exchanger;

        for (int i = 0; i < cards.length; i++) {
            int randomIndex = randomizer.nextInt(cards.length);
            exchanger = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = exchanger;
        }
    }

    public static CardDeck createFullCardDeck() {
        CardDeck cardDeck = new CardDeck(54);
        for (Suit suit : Suit.values()) {
            switch (suit) {
                case TRIANGLE-> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 6 || i == 9) {
                            continue;
                        }
                        cardDeck.push(Card.createTriangleCardOfValue(i));
                    }
                }
                case CIRCLE-> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 6 || i == 9) {
                            continue;
                        }
                        cardDeck.push(Card.createCircleCardOfValue(i));
                    }
                }
                case SQUARE-> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 4 || i == 6 || i == 8 || i == 9 || i == 12) {
                            continue;
                        }
                        cardDeck.push(Card.createSquareCardOfValue(i));
                    }
                }
                case CROSS-> {
                    for (int i = 1; i <= 14; i++) {
                        if (i == 4 || i == 6 || i == 8 || i == 9 || i == 12) {
                            continue;
                        }
                        cardDeck.push(Card.createCrossCardOfValue(i));
                    }
                }
                case STAR-> {
                    for (int i = 1; i <= 8; i++) {
                        if (i == 6) {
                            continue;
                        }
                        cardDeck.push(Card.createStarCardOfValue(i));
                    }
                }
                case WHOT-> {
                    for (int i = 1; i <= 5; i++) {
                        cardDeck.push(Card.createWhotCardOfValue(i));
                    }
                }
            }
        }
        return cardDeck;
    }

    public String push() {
        return push();
    }
}

