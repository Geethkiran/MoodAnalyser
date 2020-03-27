package com.MoodAnalyser.java;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("sad")){
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}