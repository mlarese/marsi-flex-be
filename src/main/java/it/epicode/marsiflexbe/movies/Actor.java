package it.epicode.marsiflexbe.movies;

import lombok.Data;

@Data
public class Actor {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String fiscalCode;
    private String zipCode;
    private String province;
    private String region;
    private String nation;


}
