package com.sertres.reporte.domain;

import java.time.LocalDateTime;

public class User {

    private int userId;

    private String user;

    private String userName;

    private String pass;

    private String userDetails;

    private String UserMail;

    private LocalDateTime lastAccess;

    private int accessLevel;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }

    public String getUserMail() {
        return UserMail;
    }

    public void setUserMail(String userMail) {
        this.UserMail = userMail;
    }

    public LocalDateTime getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(LocalDateTime lastAccess) {
        this.lastAccess = lastAccess;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    //relacion user => AccessLevel
    private AccessLevel accessLevelRel;

    public AccessLevel getAccessLevelRel() {
        return accessLevelRel;
    }

    public void setAccessLevelRel(AccessLevel accessLevelRel) {
        this.accessLevelRel = accessLevelRel;
    }
}
