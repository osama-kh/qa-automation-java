package infra;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;

public class HTTP_Facade {
    public static int getStatus() {
        return status;
    }

    private static int status;

    public static <T> T GET(Class<T> clz,String URL){
        String result = null;
        HttpGet request = new HttpGet(URL);
        try(CloseableHttpClient httpClient = HttpClients.createDefault()){
            try(CloseableHttpResponse response = httpClient.execute(request)){
                HttpEntity entity =response.getEntity();
                result = EntityUtils.toString(entity);
                status= response.getCode();

            }

        } catch (IOException | ParseException e ) {
            throw new RuntimeException(e);
        }
        Gson gson=new Gson();
        try{
            System.out.println(result);
            return  gson.fromJson(result, clz);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public static <T> T POST(Class<T> clz,String URL){
        String result = null;
        HttpPost request = new HttpPost(URL);
        try(CloseableHttpClient httpClient = HttpClients.createDefault()){
            try(CloseableHttpResponse response = httpClient.execute(request)){
                HttpEntity entity =response.getEntity();
                result = EntityUtils.toString(entity);

            }

        } catch (IOException | ParseException e ) {
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
