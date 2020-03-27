package com.MoodAnalyser.java;

public class MoodAnalyser {

        public String analyseMood(String message){
            try {
                if (message.contains("sad")) {
                    return "SAD";
                }
                return "HAPPY";
            }catch(NullPointerException e){
                return "HAPPY";
            }
        }
    }
