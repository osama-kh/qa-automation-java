package logic;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class LISTING_CARDS_IN_PILES {
    @SerializedName("success")
    private boolean success;
    private String deck_id;
    private String remaining;
    private Map<String, Pile> piles;

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRemaining() {
        return remaining;
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public Map<String, Pile> getPiles() {
        return piles;
    }

    public void setPiles(Map<String, Pile> piles) {
        this.piles = piles;
    }
}
