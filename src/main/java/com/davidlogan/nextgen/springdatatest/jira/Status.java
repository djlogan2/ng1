package com.davidlogan.nextgen.springdatatest.jira;

public class Status {
    private String self;
    private String description;
    private String iconUrl;
    private String name;
    private String id;
    StatusCategory StatusCategoryObject;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public String getDescription() {
        return description;
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

    public StatusCategory getStatusCategory() {
        return StatusCategoryObject;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setStatusCategory(StatusCategory statusCategoryObject) {
        this.StatusCategoryObject = statusCategoryObject;
    }
}
