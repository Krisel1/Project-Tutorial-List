package com.APP.Lista.de.Tutoriales.Modules;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String description;

    public Tutorial() {
    }

    public Tutorial(String title, String description) {
        this.title = title;
        this.description = description;
    }

}