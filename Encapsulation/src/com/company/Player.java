package com.company;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player(){
        handleName = "Unknown player";
        lives = 3;
        level = 1;
        score = 0;
    }

    public Player(String handle){
        handleName = handle;
        lives = 3;
        level = 1;
        score = 0;
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle){
        if(handle.length() < 3){
            return;
        }
        handleName = handle;
    }
}
