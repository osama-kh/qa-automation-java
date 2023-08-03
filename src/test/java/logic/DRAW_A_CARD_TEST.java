package logic;

import infra.HTTP_Facade;
import org.junit.Assert;
import org.junit.Test;


public class DRAW_A_CARD_TEST  {
    Provider provider= Provider.provider();

public DRAW_A_CARD_TEST(){
    provider.setDraw_a_card(HTTP_Facade.GET(DRAW_A_CARD.class,"https://deckofcardsapi.com/api/deck/"+provider.getNew_deck().getDeck_id()+"/draw/?count=2"));


}
    @Test
    public void Data_validation(){

        Assert.assertTrue(Help_functions.type_checker(provider.getDraw_a_card().isSuccess(),Boolean.class.getName()));
        Assert.assertTrue(Help_functions.type_checker(provider.getDraw_a_card().getDeck_id(),String.class.getName()));
        for(Card indx : provider.getDraw_a_card().getCards()){
            Assert.assertTrue(Help_functions.type_checker(indx.getCode(),String.class.getName()));
            Assert.assertTrue(Help_functions.type_checker(indx.getImage(),String.class.getName()));
            Assert.assertTrue(Help_functions.type_checker(indx.getImages().getPng(),String.class.getName()));
            Assert.assertTrue(Help_functions.type_checker(indx.getImages().getSvg(),String.class.getName()));
            Assert.assertTrue(Help_functions.type_checker(indx.getValue(),String.class.getName()));
            Assert.assertTrue(Help_functions.type_checker(indx.getSuit(),String.class.getName()));
        }
        Assert.assertTrue(Help_functions.type_checker(provider.getDraw_a_card().getRemaining(),Integer.class.getName()));

    }
    @Test
    public void Status_validation(){
        Assert.assertEquals(HTTP_Facade.getStatus(),200);

    }
}