package com.sertres.reporte.domain;

import javax.persistence.OneToMany;

public class AccessLevel {

    private int accessLevelId;

    private String accessLevelName;

    private String accessLevelDetails;

    private String accessLevelType;

    public int getAccessLevelId() {
        return accessLevelId;
    }

    public void setAccessLevelId(int accessLevelId) {
        this.accessLevelId = accessLevelId;
    }

    public String getAccessLevelName() {
        return accessLevelName;
    }

    public void setAccessLevelName(String accessLevelName) {
        this.accessLevelName = accessLevelName;
    }

    public String getAccessLevelDetails() {
        return accessLevelDetails;
    }

    public void setAccessLevelDetails(String accessLevelDetails) {
        this.accessLevelDetails = accessLevelDetails;
    }

    public String getAccessLevelType() {
        return accessLevelType;
    }

    public void setAccessLevelType(String accessLevelType) {
        this.accessLevelType = accessLevelType;
    }

}
