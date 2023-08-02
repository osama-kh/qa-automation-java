package logic;

import java.util.List;
import java.util.Map;

public class ADDING_TO_PILES {

    private boolean success;
    private String deck_id;
    private int remaining;

    public Map<String, Pile> getPiles() {
        return piles;
    }

    public void setPiles(Map<String, Pile> piles) {
        this.piles = piles;
    }

    private Map<String,Pile> piles;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }


}
