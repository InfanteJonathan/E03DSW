package com.example.ec03dsw;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @OneToMany(targetEntity = Instrumento.class, mappedBy="categoria")
    @OrderBy("nombre ASC")
    private Set<Instrumento> instrumentos = new HashSet<Instrumento>();

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Set<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
