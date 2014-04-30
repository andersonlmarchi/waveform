package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SuppressWarnings("ValidPrimaryTableName")
public class User extends Generic {
    
    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;
    
    @Column(name = "user_email", nullable = false, length = 100)
    private String userMail;
    
    @Column(name = "user_password", nullable = false, length = 100)
    private String userPass;
    
    @Column(name = "user_first_entry", nullable = false)
    private boolean userFirstEntry;

    public String getUserName() {
            return userName;
    }

    public void setUserName(String userName) {
            this.userName = userName;
    }

    public String getUserMail() {
            return userMail;
    }

    public void setUserMail(String userMail) {
            this.userMail = userMail;
    }

    public String getUserPass() {
            return userPass;
    }

    public void setUserPass(String userPass) {
            this.userPass = userPass;
    }

    public boolean isUserFirstEntry() {
            return userFirstEntry;
    }

    public void setUserFirstEntry(boolean userFirstEntry) {
            this.userFirstEntry = userFirstEntry;
    }

}
