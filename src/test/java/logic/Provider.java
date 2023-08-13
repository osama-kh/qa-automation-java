package logic;

import lombok.Data;

@Data
public class Provider {
    static private Provider provider=new Provider();
    private NEW_DECK new_deck;
    private DRAW_A_CARD draw_a_card;
    private ADDING_TO_PILES adding_to_piles;
    private LISTING_CARDS_IN_PILES listing_cards_in_piles;

    private Provider(){

    }

    static Provider provider(){
        return provider;
    }




}
