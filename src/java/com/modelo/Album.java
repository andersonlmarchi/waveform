package com.modelo;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "album")
public class Album extends Generic {
    
    @Column(name = "album_name", nullable = false, length = 100)
    private String albumName;
    
    @Column(name = "album_release", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar albumRelease;
    
    @Column(name = "album_tracks")
    private int albumTracks;
    
    @Column(name = "album_length")
    private float albumFullLength;

    public String getAlbumName() {
            return albumName;
    }

    public void setAlbumName(String albumName) {
            this.albumName = albumName;
    }

    public Calendar getAlbumRelease() {
            return albumRelease;
    }

    public void setAlbumRelease(Calendar albumRelease) {
            this.albumRelease = albumRelease;
    }

    public int getAlbumTracks() {
            return albumTracks;
    }

    public void setAlbumTracks(int albumTracks) {
            this.albumTracks = albumTracks;
    }

    public float getAlbumFullLength() {
            return albumFullLength;
    }

    public void setAlbumFullLength(float albumFullLength) {
            this.albumFullLength = albumFullLength;
    }
	
}