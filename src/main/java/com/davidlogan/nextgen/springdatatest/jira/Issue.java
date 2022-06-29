package com.davidlogan.nextgen.springdatatest.jira;

public class Issue {
    private String expand;
    private String id;
    private String self;
    private String key;
    Fields FieldsObject;


    // Getter Methods

    public String getExpand() {
        return expand;
    }

    public String getId() {
        return id;
    }

    public String getSelf() {
        return self;
    }

    public String getKey() {
        return key;
    }

    public Fields getFields() {
        return FieldsObject;
    }

    // Setter Methods

    public void setExpand(String expand) {
        this.expand = expand;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setFields(Fields fieldsObject) {
        this.FieldsObject = fieldsObject;
    }
}
