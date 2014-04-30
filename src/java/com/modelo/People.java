package com.modelo;

import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "people")
public class People extends Generic {

    @Column(name = "people_first_name", nullable = false, length = 100)
    private String peopleFirstName;
    
    @Column(name = "people_middle_name", nullable = true, length = 100)
    private String peopleMiddleName;
    
    @Column(name = "people_last_name", nullable = false, length = 100)
    private String peopleLastName;
    
    @Column(name = "people_birthday", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar peopleBirthday;
    
    @Lob @Basic(fetch= FetchType.LAZY)
    @Column(name = "people_profile_photo")
    private byte[] peopleProfilePhoto;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk")
    private User peopleUser;

    public String getPeopleFirstName() {
        return peopleFirstName;
    }

    public void setPeopleFirstName(String peopleFirstName) {
        this.peopleFirstName = peopleFirstName;
    }

    public String getPeopleMiddleName() {
        return peopleMiddleName;
    }

    public void setPeopleMiddleName(String peopleMiddleName) {
        this.peopleMiddleName = peopleMiddleName;
    }

    public String getPeopleLastName() {
        return peopleLastName;
    }

    public void setPeopleLastName(String peopleLastName) {
        this.peopleLastName = peopleLastName;
    }

    public Calendar getPeopleBirthday() {
        return peopleBirthday;
    }

    public void setPeopleBirthday(Calendar peopleBirthday) {
        this.peopleBirthday = peopleBirthday;
    }

    public byte[] getPeopleProfilePhoto() {
        return peopleProfilePhoto;
    }

    public void setPeopleProfilePhoto(byte[] peopleProfilePhoto) {
        this.peopleProfilePhoto = peopleProfilePhoto;
    }

    public User getPeopleUser() {
        return peopleUser;
    }

    public void setPeopleUser(User peopleUser) {
        this.peopleUser = peopleUser;
    }
	
}