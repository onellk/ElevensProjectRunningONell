package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTest
{
    /**
     * Default constructor for test class CardTest
     */
    public CardTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void rankingTest()
    {
        Activity01.Card card1 = new Activity01.Card("King", "Hearts", 11);
        assertEquals("King", card1.rank());
    }

    @Test
    public void suitTester()
    {
        Activity01.Card card1 = new Activity01.Card("Queen", "Spades", 11);
        assertEquals("Spades", card1.suit());
    }

    @Test
    public void pointValueTester()
    {
        Activity01.Card card1 = new Activity01.Card("Ace", "Clubs", 1);
        assertEquals(1, card1.pointValue());
    }

    @Test
    public void toStringTester()
    {
        Activity01.Card card1 = new Activity01.Card("Jack", "Diamonds", 11);
        assertEquals("Jack of Diamonds (point value = 11)", card1.toString());
    }

    @Test
    public void compareCardsTester()
    {
        Activity01.Card card1 = new Activity01.Card("King", "Clubs", 11);
        Activity01.Card card2 = new Activity01.Card("King", "Clubs", 11);
        assertEquals(true, card1.matches(card2));
    }

    @Test
    public void compareCardsTester2()
    {
        Activity01.Card card1 = new Activity01.Card("King", "Spades", 11);
        Activity01.Card card2 = new Activity01.Card("King", "Hearts", 11);
        assertEquals(false, card1.matches(card2));
    }
}






