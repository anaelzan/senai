package com.escola.senai.repository;

import com.escola.senai.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Professorrepository extends JpaRepository <Professor,Long> {
}
