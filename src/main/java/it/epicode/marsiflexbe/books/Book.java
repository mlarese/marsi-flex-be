package it.epicode.marsiflexbe.books;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "books", uniqueConstraints = {
        @UniqueConstraint(name = "uc_book_isbn", columnNames = {"isbn"})
})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic book information
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private String publisher;
    
    // Additional details
    private String genre;
    private String description;
    private int numberOfPages;
    private String language;
    private String coverImageUrl;
}