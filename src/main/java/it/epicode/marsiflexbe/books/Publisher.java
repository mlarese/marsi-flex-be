package it.epicode.marsiflexbe.books;

import lombok.Data;

@Data
public class Publisher {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String country;
    private String website;
    private String email;
    private String phoneNumber;
    private int foundationYear;
}