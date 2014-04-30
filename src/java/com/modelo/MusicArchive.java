package com.modelo;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class MusicArchive extends Generic {
  
    @Lob @Basic(fetch= FetchType.LAZY)
    @Column(name = "music_archive")
    private byte[] musicArchiveFile;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Music musicArchiveMusic;

    public byte[] getMusicArchiveFile() {
        return musicArchiveFile;
    }
    
    public void setMusicArchiveFile(byte[] musicArchiveFile) {
        this.musicArchiveFile = musicArchiveFile;
    }

    public Music getMusicArchiveMusic() {
        return musicArchiveMusic;
    }

    public void setMusicArchiveMusic(Music musicArchiveMusic) {
        this.musicArchiveMusic = musicArchiveMusic;
    }
	
}