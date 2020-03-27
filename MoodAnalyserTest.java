package com.MoodAnalyserTest.java;

import com.MoodAnalyser.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("i am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessageShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("i am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNULLShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
    }

