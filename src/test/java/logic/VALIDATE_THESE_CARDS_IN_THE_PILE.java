package logic;

import infra.HTTP_Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//VALIDATE_THESE_CARDS_IN_THE_PILE
public class VALIDATE_THESE_CARDS_IN_THE_PILE {
    Provider provider=Provider.provider();

    public VALIDATE_THESE_CARDS_IN_THE_PILE(){

        provider.setListing_cards_in_piles( HTTP_Facade.GET(LISTING_CARDS_IN_PILES.class,"https://deckofcardsapi.com/api/deck/"+provider.getAdding_to_piles().getDeck_id()+"/pile/Pile1/list/"));

    }

    @Test
   public void VALIDATE_THESE_CARDS_IN_THE_PILE_TEST(){

    Assert.assertEquals(provider.getDraw_a_card().getDeck_id(),provider.getListing_cards_in_piles().getDeck_id());
    List<Card> temp_list=provider.getDraw_a_card().getCards();
    Map<String,Pile> temp=provider.getListing_cards_in_piles().getPiles();
    ArrayList<String> Cards_code_Draw_card = new ArrayList<String>();
    ArrayList<String> Cards_code_Pile_list = new ArrayList<String>();
    for(Card s:temp_list){
        Cards_code_Draw_card.add(s.getCode());
    }


        for(Card s:temp.get("Pile1").getCards()){
            Cards_code_Pile_list.add(s.getCode());
        }
        System.out.println(Cards_code_Draw_card);
        System.out.println(Cards_code_Pile_list);


Assert.assertTrue(Cards_code_Pile_list.containsAll(Cards_code_Draw_card));


    }
    @Test
    public void Status_validation(){
        Assert.assertEquals(HTTP_Facade.getStatus(),200);

    }



}
