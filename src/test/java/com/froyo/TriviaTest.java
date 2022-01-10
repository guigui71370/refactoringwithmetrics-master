package com.froyo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriviaTest {

    private  Trivia trivia;
    @Before
    public void initializeTrivia(){
        trivia=new Trivia();
    }

    @Test
    public void createRockQuestionTest() {
        int index = 1;
        String result= trivia.createRockQuestion(index);
        assertEquals("Rock Question "+index,result);
    }

    @Test
    public void isPlayable() {
        //given
        trivia.add("Guillaume");
        trivia.add("Louis");

        //when
        boolean result = trivia.isPlayable();

        //then
        assertTrue(result);
    }

    @Test
    public void isNotPlayable() {
        //given
        trivia.add("Louis");

        //when
        boolean result = trivia.isPlayable();

        //then
        assertFalse(result);
    }

    @Test
    public void dontAddMoreSixPlayer() {
        //given
        Trivia gameTest = new Trivia();
        gameTest.add("J1");
        gameTest.add("J2");
        gameTest.add("J3");
        gameTest.add("J4");
        gameTest.add("J5");
        gameTest.add("J6");

        //when
        boolean result = gameTest.add("J7");
        //then
        assertFalse(result);
    }

    @Test
    public void howManyPlayers() {
        int howManyPlayers = trivia.howManyPlayers();

        assertEquals(0,howManyPlayers);
    }
    @Test
    public void howManyWhenAddTwoPlayerPlayers() {
        trivia.add("toto");
        trivia.add("foo");

        int howManyPlayers = trivia.howManyPlayers();

        assertEquals(2,howManyPlayers);
    }

    @Test
    public void roll() {
    }

    @Test
    public void wasCorrectlyAnswered() {
    }

    @Test
    public void wrongAnswer() {
        trivia.add("toto");

        boolean wrongAnswer = trivia.wrongAnswer();

        assertTrue(wrongAnswer);
    }
}