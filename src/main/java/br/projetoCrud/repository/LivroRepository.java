package br.projetoCrud.repository;

import br.projetoCrud.entity.Autor;
import br.projetoCrud.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByName(String name);
}
