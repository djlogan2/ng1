package com.davidlogan.nextgen.springdatatest.jira;

public class Assignee {
    private String self;
    private String accountId;
    private String displayName;
    private boolean active;
    private String timeZone;
    private String accountType;


    // Getter Methods

    public String getSelf() {
        return self;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean getActive() {
        return active;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getAccountType() {
        return accountType;
    }

    // Setter Methods

    public void setSelf(String self) {
        this.self = self;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
