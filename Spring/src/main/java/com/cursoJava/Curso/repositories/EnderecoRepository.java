package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}