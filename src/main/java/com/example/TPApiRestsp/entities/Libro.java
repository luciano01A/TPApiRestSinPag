package com.example.TPApiRestsp.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Libro extends Base{
    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Paginas")
    private int paginas;

    @Column(name = "Titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
