package logic;

import lombok.Data;

@Data
public class NEW_DECK  {
    private boolean success;
    private String deck_id;
    private boolean shuffled;
    private int remaining;
}
