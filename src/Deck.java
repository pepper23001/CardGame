import java.util.ArrayList;
import java.util.Random;

public class Deck {

    public static void main(String[] args) {
        ArrayList<String> deck = createDeck();
        ArrayList<String> shuffledDeck = shuffle(deck);



    }
    static ArrayList<String> shuffle(ArrayList<String> deck){
        int unshuffled = 0;
        Random rand = new Random();


        ArrayList<String> shuffledDeck = new ArrayList<String>();
        while (unshuffled < deck.size()) {
            int placeInDeck = rand.nextInt((unshuffled+1));
            shuffledDeck.add(placeInDeck,(deck.get(unshuffled)));
            ++unshuffled;

        }
        return shuffledDeck;
    }
    static ArrayList<String> createDeck(){
        ArrayList<String> deck = new ArrayList<String>();
        String suit = "";//turn to array
        int cardNumInt = 0;
        int cardSuitInt = 0;

        String[] suits = new String[]{"D","S","C","H"};
        String[] cardNumber = new String[]{"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "};
        while (cardNumInt < cardNumber.length){

            while (cardSuitInt < suits.length){

                deck.add((suits[cardSuitInt]+cardNumber[cardNumInt]));
                ++cardSuitInt;

            }
            cardSuitInt = 0;
            ++cardNumInt;
        }
        return deck;
    }
}
