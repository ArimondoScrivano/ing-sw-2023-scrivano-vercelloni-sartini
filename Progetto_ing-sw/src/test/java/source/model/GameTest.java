package source.model;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.*;

public class GameTest extends TestCase {
    Map<Integer, List<Player>> playersTest = new HashMap<>();
    List<Player> player1 = Arrays.asList(
            new Player(0, "Arimondo"),
            new Player(1, "Lorenzo"),
            new Player(2, "Pietro"),
            new Player(3, "Rita")
    );
    List<Player> player2 = Arrays.asList(
            new Player(0, "Arimondo"),
            new Player(1, "Lorenzo"),
            new Player(2, "Pietro"),
            new Player(3, "Rita")
    );
    playersTest.put(0, player1);
    playersTest.put(1, player2);
    @TestFactory
    public void SetUp() {
        new Game(0, dashboard, playersTest.get(0), commonGoals, 122, false);
    }

    @Test
    void getCurrentPlayer() {
    }

    @Test
    void setCurrentPlayer() {

    }

    @Test
    void getCommonGoals() {
    }

    @Test
    void getCommonGoalsPoints() {
    }

    @Test
    void setCommonGoals() {

    }

    @Test
    void updatePoints() {
    }

    @Test
    void endGameToken() {
    }
}