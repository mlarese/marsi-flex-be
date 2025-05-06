package it.epicode.marsiflexbe.movies;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "movies", uniqueConstraints = {
        @UniqueConstraint(name = "uc_movie_title", columnNames = {"title"})
})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // titolo, regista, anno, casa di produzione
    private String title;
    private String director;
    private int year;
    private String productionCompany;
    // trama, genere, attori, durata
    private String plot;
    private String genre;
    private String actors;
    private int duration;
}