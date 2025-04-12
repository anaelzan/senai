package com.escola.senai.repository;

import com.escola.senai.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Alunorepository extends JpaRepository <Aluno, Long> {
}
