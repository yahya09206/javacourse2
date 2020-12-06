package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(String name) {
        super("Indenpence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(String name) {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(String name) {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take ove the universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(String name) {
        super("Forgettable");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //No plot method
}
