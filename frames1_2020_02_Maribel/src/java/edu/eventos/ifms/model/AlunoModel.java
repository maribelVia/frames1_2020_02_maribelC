package edu.eventos.ifms.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "idpessoa")
public class AlunoModel extends PessoaModel implements Serializable {

    @Column(nullable = false)
    private int idAluno;

    @ManyToMany(mappedBy = "listaDeAlunos")
    private List<EventoModel> listaDeEventos;

    public AlunoModel() {
    }

    public List<EventoModel> getListaDeEventos() {
        return listaDeEventos;
    }

    public void setListaDeEventos(List<EventoModel> listaDeEventoss) {
        this.listaDeEventos = listaDeEventos;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

}
