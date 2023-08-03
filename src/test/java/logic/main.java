package logic;

import java.io.IOException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class main {
    public static void main(String[] args) throws IOException {



        Result result = JUnitCore.runClasses(DRAW_A_CARD_TEST.class);


        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Tests run: " + result.getRunCount());
        System.out.println("Tests failed: " + result.getFailureCount());
        System.out.println("Tests ignored: " + result.getIgnoreCount());
        System.out.println("Tests execution time: " + result.getRunTime() + " milliseconds");

//NEW_DECK_TEST x=new NEW_DECK_TEST();
//        x.data_validation();

    }
    }
