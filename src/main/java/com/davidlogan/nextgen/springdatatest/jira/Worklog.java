package com.davidlogan.nextgen.springdatatest.jira;

import java.util.ArrayList;

public class Worklog {
    private float startAt;
    private float maxResults;
    private float total;
    ArrayList<Object> worklogs = new ArrayList<Object>();


    // Getter Methods

    public float getStartAt() {
        return startAt;
    }

    public float getMaxResults() {
        return maxResults;
    }

    public float getTotal() {
        return total;
    }

    // Setter Methods

    public void setStartAt(float startAt) {
        this.startAt = startAt;
    }

    public void setMaxResults(float maxResults) {
        this.maxResults = maxResults;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
