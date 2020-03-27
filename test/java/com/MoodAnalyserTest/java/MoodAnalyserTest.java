package com.MoodAnalyserTest.java;

import com.MoodAnalyser.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

        @Test
        public void givenMessage_WhenSad_ShouldReturnSad(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("I am in  sad mood");
            Assert.assertEquals("SAD", mood);
        }
            @Test public void givenMessage_WhenAnyMood_ShouldReturnHappy(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("I am in any mood");
            Assert.assertEquals("HAPPY", mood);
        }
    }

