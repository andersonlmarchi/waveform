package com.modelo;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "music")
public class Music extends Generic {
	
    @Column(name = "music_title", nullable = false, length = 100)
    private String musicTitle;
    
    @Column(name = "music_length", nullable = false)
    private float musicLength;
    
    @Column(name = "music_release", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar musicRelease;
    
    @Column(name = "music_album_track", nullable = false)
    private int musicAlbumTrack;
    
    @Column(name = "music_rate", nullable = false)
    private float musicRate;
    
    @Column(name = "music_likes", nullable = false)
    private long musicLikes;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "album_fk")
    private Album musicAlbum;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_fk")
    private Genre musicGenre;

    public String getMusicTitle() {
            return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
            this.musicTitle = musicTitle;
    }

    public float getMusicLength() {
            return musicLength;
    }

    public void setMusicLength(float musicLength) {
            this.musicLength = musicLength;
    }

    public Calendar getMusicRelease() {
            return musicRelease;
    }

    public void setMusicRelease(Calendar musicRelease) {
            this.musicRelease = musicRelease;
    }

    public int getMusicAlbumTrack() {
            return musicAlbumTrack;
    }

    public void setMusicAlbumTrack(int musicAlbumTrack) {
            this.musicAlbumTrack = musicAlbumTrack;
    }

    public float getMusicRate() {
            return musicRate;
    }

    public void setMusicRate(float musicRate) {
            this.musicRate = musicRate;
    }

    public long getMusicLikes() {
            return musicLikes;
    }

    public void setMusicLikes(long musicLikes) {
            this.musicLikes = musicLikes;
    }

    public Album getMusicAlbum() {
            return musicAlbum;
    }

    public void setMusicAlbum(Album musicAlbum) {
            this.musicAlbum = musicAlbum;
    }

    public Genre getMusicGenre() {
            return musicGenre;
    }

    public void setMusicGenre(Genre musicGenre) {
            this.musicGenre = musicGenre;
    }

}