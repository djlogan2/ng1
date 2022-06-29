package com.davidlogan.nextgen.springdatatest.jira;

public class Sprint {
    private float id;
    private String self;
    private String state;
    private String name;
    private String startDate;
    private String endDate;
    private float originBoardId;
    private String goal;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getSelf() {
        return self;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public float getOriginBoardId() {
        return originBoardId;
    }

    public String getGoal() {
        return goal;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setOriginBoardId(float originBoardId) {
        this.originBoardId = originBoardId;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
