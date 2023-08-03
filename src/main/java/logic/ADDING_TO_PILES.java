package logic;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ADDING_TO_PILES {

    private boolean success;
    private String deck_id;
    private int remaining;
    private Map<String,Pile> piles;

}
