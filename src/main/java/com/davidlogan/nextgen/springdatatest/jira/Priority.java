package com.davidlogan.nextgen.springdatatest.jira;

public class Priority {
    private String self;
    private String iconUrl;
    private String name;
    private String id;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
