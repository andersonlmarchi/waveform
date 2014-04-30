package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre extends Generic {
    
    @Column(name = "genre_name", nullable = false, length = 100)
    private String genreName;

    public String getGenreName() {
            return genreName;
    }

    public void setGenreName(String genreName) {
            this.genreName = genreName;
    }
	
}