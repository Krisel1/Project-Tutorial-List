package com.APP.Lista.de.Tutoriales.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TUTORIALS")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    public Tutorial() {
    }

    public Tutorial(String title, String description) {
        this.title = title;
        this.description = description;
    }

}