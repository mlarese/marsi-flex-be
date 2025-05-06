package it.epicode.marsiflexbe.movies;

import lombok.Data;

@Data
public class Regista {

    private Long id;
    private String name;
    private String surname;
    private String placeOfBirth;
    private String dateOfBirth;
    private int numberOfFilms;

}
