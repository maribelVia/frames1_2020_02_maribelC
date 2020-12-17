
package edu.eventos.ifms.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

public class EventoModel {
    
@Entity
@Table(name = "evento")
public class EventoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;

    private String nome;

    @ManyToMany
    @JoinTable(name = "evento_alunos",
            joinColumns = @JoinColumn(name = "idEvento"),
            inverseJoinColumns = @JoinColumn(name = "idPessoaAluno"))
    private List<AlunoModel> listaDeAlunos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPessoaServidor", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private servidorModel professor;
}
