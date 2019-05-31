package com.stackroute.model;

public class Actor {
    private int actorId;
    private int movieId;
    private String actorName;


    public Actor() {
    }

    public Actor(int actorId,int movieId, String actorName) {
        this.actorId=actorId;
        this.movieId = movieId;
        this.actorName = actorName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }


}
