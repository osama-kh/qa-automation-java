package logic;

import java.util.List;

public class Pile {
    private int remaining;
    private List<Card> cards;
    public List<Card> getCards() {

        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }




    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

}

class Discard{

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    int remaining;

}