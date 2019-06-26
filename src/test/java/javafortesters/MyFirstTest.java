package javafortesters;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo()
    {
        int answer = 2+2;
        assertEquals("2+2=4",4, answer);
    }

    @Test
    public void compareTwoPlusTwoWithFive()
    {
        int answer1 = 2+2;
        assertEquals("compare result:",5,answer1);
    }

    @Test
    public void multipleCompare()
    {
        int answer2 = 2-2;
        int answer3 = 4/2;
        int answer4 = 2*2;
        assertEquals("2-2 equals",0,answer2);
        assertEquals("4/2 equals:",2,answer3);
        assertEquals("2*2 equals:", 4, answer4);
    }
}

