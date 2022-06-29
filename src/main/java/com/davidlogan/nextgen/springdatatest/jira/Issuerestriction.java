package com.davidlogan.nextgen.springdatatest.jira;

public class Issuerestriction {
    Issuerestrictions IssuerestrictionsObject;
    private boolean shouldDisplay;


    // Getter Methods

    public Issuerestrictions getIssuerestrictions() {
        return IssuerestrictionsObject;
    }

    public boolean getShouldDisplay() {
        return shouldDisplay;
    }

    // Setter Methods

    public void setIssuerestrictions(Issuerestrictions issuerestrictionsObject) {
        this.IssuerestrictionsObject = issuerestrictionsObject;
    }

    public void setShouldDisplay(boolean shouldDisplay) {
        this.shouldDisplay = shouldDisplay;
    }
}
