package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.stream.Collectors;
@Entity
@Table(name="Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private ArrayList<String> languages;

    private int download_count;

    @OneToMany(mappedBy = "libro")
    private ArrayList<Autor> authors;

    public Libro() {
    }


    public Libro(LibroDTO dato){

        this.title = dato.title();
        System.out.println(dato.languages());
        this.languages = new ArrayList<>(dato.languages());
        this.download_count = dato.download_count();
        this.authors = new ArrayList<>(dato.authors().stream().map(d -> new Autor(d.name(),d.birth_year(),d.death_year())).collect(Collectors.toList()));
    }


    @Override
    public String toString() {
        return "Efectivamente" +
                ", title='" + title + '\'' + '\n'+
                "authors=" + authors +
                ", languages=" + languages + '\n'+
                ", download_count=" + download_count;
    }
}
