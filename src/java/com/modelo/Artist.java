package com.modelo;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist extends Generic{

    @Column(name = "artist_name", nullable = false, length = 100)
    private String artistName;
    
    @Lob @Basic(fetch= FetchType.LAZY)
    @Column(name = "artist_photo")
    private byte[] artistPhoto;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk")
    private User artistUser;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public byte[] getArtistPhoto() {
        return artistPhoto;
    }

    public void setArtistPhoto(byte[] artistPhoto) {
        this.artistPhoto = artistPhoto;
    }

    public User getArtistUser() {
        return artistUser;
    }

    public void setArtistUser(User artistUser) {
        this.artistUser = artistUser;
    }

}