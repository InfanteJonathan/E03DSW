package com.example.ec03dsw;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento,Integer> {
    
    List<Instrumento> findByNombre(@Param("nombre") String nombre);

}