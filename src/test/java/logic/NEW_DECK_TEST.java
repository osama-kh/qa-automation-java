package logic;

import infra.HTTP_Facade;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;


public class NEW_DECK_TEST {
    Provider provider= Provider.provider();
//   static NEW_DECK new_deck;
    public NEW_DECK_TEST(){

        provider.setNew_deck( HTTP_Facade.GET(NEW_DECK.class,"https://deckofcardsapi.com/api/deck/new/"));
    }

@Test
    public void Data_validation(){

        Assert.assertTrue(Help_functions.type_checker(provider.getNew_deck().isSuccess(),Boolean.class.getName()));
        Assert.assertTrue(Help_functions.type_checker(provider.getNew_deck().getDeck_id(),String.class.getName()));
        Assert.assertTrue(Help_functions.type_checker(provider.getNew_deck().isShuffled(),Boolean.class.getName()));
        Assert.assertTrue(Help_functions.type_checker(provider.getNew_deck().getRemaining(),Integer.class.getName()));

    }
@Test
    public void Status_validation(){
        Assert.assertEquals(HTTP_Facade.getStatus(),200);

    }


}


