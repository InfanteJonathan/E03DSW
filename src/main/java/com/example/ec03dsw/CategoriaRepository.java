package com.example.ec03dsw;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer>,CrudRepository<Categoria,Integer> {

    // Método para buscar categorías por el nombre
    List<Categoria> findByNombre(@Param("nombre") String nombre);
}
