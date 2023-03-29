package model;

import junit.framework.TestCase;
import model.cgoal.CommonGoals;
import org.junit.jupiter.api.Test;
import java.util.*;

public class GameTest extends TestCase {
    List<Player> playersTest = new ArrayList<>();
    List<Player> player1 = Arrays.asList(
            new Player(0, "Arimondo"),
            new Player(1, "Lorenzo"),
            new Player(2, "Pietro"),
            new Player(3, "Rita")
    );
    List<CommonGoals> commonGoalsTest = new ArrayList<>();

    @Test
    public void testGetCurrentPlayer() throws NoSuchElementException {
        Dashboard dashboard = new Dashboard(2, new Bag());
        playersTest.addAll(player1);
        Game game1 = new Game(0, dashboard, playersTest);
        assertEquals(game1.getCurrentPlayer(), playersTest.get(0));
    }

    @Test
    public void testSetCurrentPlayer() throws NoSuchElementException {
        Dashboard dashboard = new Dashboard(2, new Bag());
        playersTest.addAll(player1);
        Game game1 = new Game(0, dashboard, playersTest);
        game1.setCurrentPlayer(player1.get(3));
        assertEquals(game1.getCurrentPlayer(), playersTest.get(3));
    }

    @Test
    public void testGetCommonGoals() throws NoSuchElementException{
        Dashboard dashboard = new Dashboard(2, new Bag());
        playersTest.addAll(player1);
        Game game1 = new Game(0, dashboard, playersTest);
        commonGoalsTest = game1.getCommonGoals();
        assertEquals(game1.getCommonGoals(), commonGoalsTest);
    }

    @Test
    public void testGetCommonGoalsPoints() throws NoSuchElementException, ArrayIndexOutOfBoundsException {
        Dashboard dashboard = new Dashboard(2, new Bag());
        playersTest.addAll(player1);
        Game game1 = new Game(0, dashboard, playersTest);
        commonGoalsTest = game1.getCommonGoals();
        assertEquals(8, game1.getCommonGoalsPoints(commonGoalsTest, 1));
        assertEquals(8, game1.getCommonGoalsPoints(commonGoalsTest, 2));
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