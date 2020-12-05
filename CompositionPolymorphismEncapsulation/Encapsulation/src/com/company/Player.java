package com.company;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            //Reduce number of lives remaining for player
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
