package logic;

import infra.HTTP_Facade;
import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CARDS_ARE_NO_LONGER_IN_THE_DECK_TEST {

    Provider provider=Provider.provider();
    public CARDS_ARE_NO_LONGER_IN_THE_DECK_TEST(){
        provider.setListing_cards_in_piles( HTTP_Facade.GET(LISTING_CARDS_IN_PILES.class,"https://deckofcardsapi.com/api/deck/"+provider.getAdding_to_piles().getDeck_id()+"/pile/Pile1/list/"));
    }
    @Test
    public void CARDS_ARE_NO_LONGER_IN_THE_DECK(){

        Assert.assertEquals(provider.getDraw_a_card().getDeck_id(),provider.getListing_cards_in_piles().getDeck_id());
        List<Card> temp_list=provider.getDraw_a_card().getCards();
        Map<String,Pile> temp=provider.getListing_cards_in_piles().getPiles();
        ArrayList<String> Cards_code_Draw_card = new ArrayList<String>();
        ArrayList<String> Cards_code_Pile_list = new ArrayList<String>();
        for(Card s:temp_list){
            Cards_code_Draw_card.add(s.getCode());
        }
        for(String indx: temp.keySet()){
            System.out.println(indx);
            for(Card s:temp.get(indx).getCards()){
                System.out.println(s);
                Cards_code_Pile_list.add(s.getCode());        }

        }

        Assert.assertTrue(Cards_code_Pile_list.containsAll(Cards_code_Draw_card));





    }

    @Test
    public void Status_validation(){
        Assert.assertEquals(HTTP_Facade.getStatus(),200);

    }


}
