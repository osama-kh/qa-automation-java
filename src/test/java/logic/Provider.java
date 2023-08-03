package logic;

import lombok.Data;

@Data
public class Provider {
    static private Provider provider=new Provider();
    NEW_DECK new_deck;
    DRAW_A_CARD draw_a_card;

    private Provider(){

    }

    static Provider provider(){
        return provider;
    }




}
