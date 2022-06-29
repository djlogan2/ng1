package com.davidlogan.nextgen.springdatatest.jira;

public class Votes {
    private String self;
    private float votes;
    private boolean hasVoted;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public float getVotes() {
        return votes;
    }

    public boolean getHasVoted() {
        return hasVoted;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setVotes(float votes) {
        this.votes = votes;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
