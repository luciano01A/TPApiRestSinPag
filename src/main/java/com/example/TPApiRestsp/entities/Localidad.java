package com.example.TPApiRestsp.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "Localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Localidad extends Base {
    @Column(name = "Denominacion")
    private String denominacion;
}
