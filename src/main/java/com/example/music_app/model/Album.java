package com.example.music_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Album {
    @Id
    private Long id;
}
