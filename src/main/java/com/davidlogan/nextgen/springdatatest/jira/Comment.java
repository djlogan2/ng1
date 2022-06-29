package com.davidlogan.nextgen.springdatatest.jira;

import java.util.ArrayList;

public class Comment {
    ArrayList<Object> comments = new ArrayList<Object>();
    private String self;
    private float maxResults;
    private float total;
    private float startAt;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public float getMaxResults() {
        return maxResults;
    }

    public float getTotal() {
        return total;
    }

    public float getStartAt() {
        return startAt;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setMaxResults(float maxResults) {
        this.maxResults = maxResults;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setStartAt(float startAt) {
        this.startAt = startAt;
    }
}
