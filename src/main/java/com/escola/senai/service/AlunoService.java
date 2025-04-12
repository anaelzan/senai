package com.escola.senai.service;

import com.escola.senai.model.Aluno;
import com.escola.senai.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunorepository;


    // Metodos para cadastrar Aluno:
    public Aluno salvarAluno(Aluno aluno){
        return alunorepository.save(aluno);
    }

    // Buscar a todos os alunos:
    public List<Aluno>  buscatTodosAlunos(){
        return alunorepository.findAll();

    }

    // Metodos para buscar por ID:
    public Optional<Aluno> buscarAlunoId(Long Id){
        return alunorepository.findById(Id);

    }
    // Metodos para deletar um Aluno pelo ID
    public void deletarAlunoPorId (Long Id){
        alunorepository.deleteById(Id);

    }
    // Atualizar um novo aluno
    public Aluno atualizarAluno (Long Id, Aluno alunoAtualizado){
        return alunorepository.findById(Id)
                .map(aluno-> {
                    aluno.setNomeAluno(alunoAtualizado.getNomeAluno());
                    aluno.setIdadeAluno(alunoAtualizado.getIdadeAluno());
                    aluno.setMatriculAluno(alunoAtualizado.getMatriculAluno());
                    return alunorepository.save(aluno);
                })
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o ID: " + Id));

    }

    }


