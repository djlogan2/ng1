package com.davidlogan.nextgen.springdatatest.jira;

public class Project {
    private String self;
    private String id;
    private String key;
    private String name;
    private String projectTypeKey;
    private boolean simplified;

    // Getter Methods

    public String getSelf() {
        return self;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getProjectTypeKey() {
        return projectTypeKey;
    }

    public boolean getSimplified() {
        return simplified;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
    }

    public void setSimplified(boolean simplified) {
        this.simplified = simplified;
    }
}
