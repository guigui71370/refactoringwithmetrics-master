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
    }

    @Test
    public void add() {
    }

    @Test
    public void howManyPlayers() {
    }

    @Test
    public void roll() {
    }

    @Test
    public void wasCorrectlyAnswered() {
    }

    @Test
    public void wrongAnswer() {
    }
}