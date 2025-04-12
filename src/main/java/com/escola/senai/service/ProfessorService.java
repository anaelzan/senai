package com.escola.senai.service;

import com.escola.senai.model.Aluno;
import com.escola.senai.model.Professor;
import com.escola.senai.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    private ProfessorRepository professorRepository;

    // Metodos para cadastrar Professores:
    public Professor salvarProfessor(Professor professor){
        return ProfessorRepository.save(professor);
    }

    // Buscar a todos os Professores:
    public List<Professor> buscatTodosProfessor(){
        return ProfessorRepository.findAll();

    }

    // Metodos para buscar por ID:
    public Optional<Professor> buscarProfessorId(Long Id){
        return ProfessorRepository.findById(Id);

    }
    // Metodos para deletar um Professor pelo ID
    public void deletarProfessorPorId (Long Id){
        ProfessorRepository.deleteById(Id);

    }
    // Atualizar um novo Professor
    public Aluno atualizarAluno (Long Id, Professor professorAtulizado){
        return ProfessorRepository.findById(Id)
        return professorRepository.findById(I)
                .map(professor -> {
                    professor.setNomeProfessor(Professor.getNome());
                    professor.setDisciplinaProfessor(professorAtulizado.());
                    return professorRepository.save(professor);
                })
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: " + id));
    }

    // Deletar (Delete)
    public void deletarProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}

    }

}
}
