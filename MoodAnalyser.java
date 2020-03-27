package com.MoodAnalyser.java;

public class MoodAnalyser {

    public String analyseMood(String message) throws MoodAnalyserException {
        try {
            if(message.length()==0){
                throw  new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"EMPTY MOOD");
            }
            if (message.contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        }catch(NullPointerException e){
            throw  new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"NULL MOOD");
        }
    }
    }
