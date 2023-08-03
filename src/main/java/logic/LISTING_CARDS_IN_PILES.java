package logic;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Map;
@Data
public class LISTING_CARDS_IN_PILES {
    @SerializedName("success")
    private boolean success;
    private String deck_id;
    private String remaining;
    private Map<String, Pile> piles;

}
