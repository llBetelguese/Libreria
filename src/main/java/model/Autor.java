package model;


import jakarta.persistence.*;

@Entity
@Table(name = "Autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String birth_year;
    private String death_year;
    @ManyToOne
    private Libro libro;

    public Autor(){

    }

    public Autor(String name, String birth_year, String death_year){
        this.name = name;
        this.birth_year = birth_year;
        this.death_year = death_year;
    }

    @Override
    public String toString() {
        return "Si name='" + name + '\'' +'\n'+
                ", birth_year='" + birth_year + '\'' +'\n'+
                ", death_year='" + death_year + '\''+'\n';
    }
}
