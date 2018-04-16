package com.company;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;


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
//        this.handleName = handle;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
//        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle){
        if(handle.length() < 3){
            System.out.println("The name " + handle + " is too short. Must be 3 characters or more.");
            return;
        }
        this.handleName = handle;

    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int level){
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
        setLevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Loot> inventory) {
        this.inventory = inventory;
    }
}
