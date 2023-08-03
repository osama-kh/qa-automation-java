package API;//package api;

import com.google.gson.Gson;
import logic.*;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import javax.xml.transform.Result;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) throws IOException{

        String x="111";
        System.out.println(x.getClass().getName());
        NEW_DECK Json = GET(NEW_DECK.class,"https://deckofcardsapi.com/api/deck/new/");
//
        System.out.println(Json.getDeck_id());

//        String res2 =GET("https://deckofcardsapi.com/api/deck/"+deck.getDeck_id()+"/draw/?count=2");
//        System.out.println(res2);
//        DRAW_A_CARD draw = gson.fromJson(res2,DRAW_A_CARD.class);
//        System.out.println(draw.getCards());
// bv
//        String res3 =GET("https://deckofcardsapi.com/api/deck/"+deck.getDeck_id()+"/pile/Pile1/add/?cards=AS,2S");
//        System.out.println(res3);
//        ADDING_TO_PILES add = gson.fromJson(res3, ADDING_TO_PILES.class);
//        System.out.println(add.getPiles().get("Pile1").getRemaining());
//
//        String res4 =GET("https://deckofcardsapi.com/api/deck/"+deck.getDeck_id()+"/pile/Pile1/list/");
//        System.out.println(res4);
//        LISTING_CARDS_IN_PILES Listing = gson.fromJson(res4, LISTING_CARDS_IN_PILES.class);
//        System.out.println(Listing.getPiles().get("Pile1").getCards().get(0).getCode()  );


    }



    public static <T> T GET(Class<T> clz,String URL){
        String result = null;
        HttpGet request = new HttpGet(URL);
    try(CloseableHttpClient httpClient = HttpClients.createDefault()){
    try(CloseableHttpResponse response = httpClient.execute(request)){
        HttpEntity entity =response.getEntity();
        result = EntityUtils.toString(entity);

    }

    } catch (IOException |ParseException e ) {
        throw new RuntimeException(e);
    }
        Gson gson=new Gson();
try{
    return  gson.fromJson(result, clz);

} catch (Exception e) {
    throw new RuntimeException(e);
}


    }

}