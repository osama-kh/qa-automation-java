package logic;

import lombok.Data;

@Data
public class Provider {
    static private Provider provider=new Provider();
    NEW_DECK new_deck;
    DRAW_A_CARD draw_a_card;
    ADDING_TO_PILES adding_to_piles;
    LISTING_CARDS_IN_PILES listing_cards_in_piles;

    private Provider(){

    }

    static Provider provider(){
        return provider;
    }




}
