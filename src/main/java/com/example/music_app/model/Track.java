package com.example.music_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Track {
    @Id
    private Long id;

    private String name;

    private Author author;

    private Album album;

}
