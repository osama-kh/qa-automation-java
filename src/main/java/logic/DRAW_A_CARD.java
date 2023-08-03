package logic;

import lombok.Data;

import java.util.List;
@Data
public class DRAW_A_CARD {

    private boolean success;
    private String deck_id;
    private List<Card> cards;
    private int remaining;

}
