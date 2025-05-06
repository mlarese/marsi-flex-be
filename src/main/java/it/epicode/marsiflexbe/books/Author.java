package it.epicode.marsiflexbe.books;

import lombok.Data;

@Data
public class Author {
    private Long id;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String placeOfBirth;
    private String biography;
    private String nationality;
    private String website;
    private String email;
}