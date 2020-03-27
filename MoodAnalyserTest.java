package com.MoodAnalyserTest.java;

import com.MoodAnalyser.java.MoodAnalyser;
import com.MoodAnalyser.java.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("i am in sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessageShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("i am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("EMPTY MOOD", e.getMessage());
        }
    }
    @Test
    public void givenNullMoodShouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            String mood = moodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("NULL MOOD", e.getMessage());
        }
    }
    }

