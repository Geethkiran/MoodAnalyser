package com.MoodAnalyserTest.java;

import com.MoodAnalyser.java.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

        @Test
        public void givenMessage_WhenSad_PassedThroughConstructor_ShouldReturnSad(){
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        }
            @Test public void givenMessage_WhenHappy_PassedThroughConstructor_ShouldReturnHappy(){
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
    }

