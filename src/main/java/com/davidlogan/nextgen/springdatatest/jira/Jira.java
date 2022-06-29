package com.davidlogan.nextgen.springdatatest.jira;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "test1")
public class Jira {
    private String expand;
    private float startAt;
    private float maxResults;
    private float total;
    ArrayList< Issue > issues = new ArrayList <> ();


    // Getter Methods

    public String getExpand() {
        return expand;
    }

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

    public void setExpand(String expand) {
        this.expand = expand;
    }

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
