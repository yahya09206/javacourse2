package com.company;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player(){
        this("Unknown player");
    }

    public Player(String handle){
        this(handle, 1);
//        handleName = handle;
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String handle, int startingLevel){
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
