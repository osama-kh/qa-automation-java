package logic;

import lombok.Data;

import java.util.List;
@Data
public class Pile {
    private int remaining;
    private List<Card> cards;

}
@Data
class Discard{
    int remaining;

}