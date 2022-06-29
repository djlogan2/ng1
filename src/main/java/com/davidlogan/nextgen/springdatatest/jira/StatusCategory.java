package com.davidlogan.nextgen.springdatatest.jira;

public class StatusCategory {
    private String self;
    private float id;
    private String key;
    private String colorName;
    private String name;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public float getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getColorName() {
        return colorName;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
