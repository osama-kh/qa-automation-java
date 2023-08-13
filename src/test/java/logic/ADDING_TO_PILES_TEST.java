package logic;

import infra.HTTP_Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    @ParameterizedTest
    @ValueSource(strings = {"a12dfd2", "ffedf4445", "ef1584g"})
    public void Deck_ID_should_not_be_null(String deckId) {
        // Assuming provider is accessible from this test class and the object is properly initialized
        // Set the deckId in the provider or make necessary API call
        provider.setAdding_to_piles(HTTP_Facade.GET(ADDING_TO_PILES.class,
                "https://deckofcardsapi.com/api/deck/" + deckId + "/pile/Pile1/add/?cards=AS,2S"));

        // Assert if the deck_id in the provider is not null
        Assert.assertNotNull(provider.getAdding_to_piles().getDeck_id());
    }


}