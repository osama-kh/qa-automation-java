package logic;

import infra.HTTP_Facade;
import org.junit.Assert;
import org.junit.Test;

public class ADDING_TO_PILES_TEST {

    Provider provider = Provider.provider();


    public ADDING_TO_PILES_TEST(){

        provider.setAdding_to_piles( HTTP_Facade.GET(ADDING_TO_PILES.class,"https://deckofcardsapi.com/api/deck/"+provider.getDraw_a_card().getDeck_id()+"/pile/Pile1/add/?cards=AS,2S"));
    }
    @Test
    public void Data_validation(){

        Assert.assertTrue(Help_functions.type_checker(provider.getAdding_to_piles().isSuccess(),Boolean.class.getName()));
        Assert.assertTrue(Help_functions.type_checker(provider.getAdding_to_piles().getDeck_id(),String.class.getName()));
        for (String indx : provider.getAdding_to_piles().getPiles().keySet()){
            Assert.assertTrue(Help_functions.type_checker(provider.getAdding_to_piles().getPiles().get(indx).getRemaining(),Integer.class.getName()));
        }
        Assert.assertTrue(Help_functions.type_checker(provider.getAdding_to_piles().getRemaining(),Integer.class.getName()));

    }
@Test
    public void Status_validation(){
        Assert.assertEquals(HTTP_Facade.getStatus(),200);

    }

}