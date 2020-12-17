<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "campus")
public class campusModel implements Serializable {

    @Id
    @GeneratedValue
    private long idCampus;

    @Column(nullable = false, length = 80)
    private String campusNome;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idCidade", insertable = true, updatable = true)
    private cidadeModel cidade;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idEstado", insertable = true, updatable = true)
    private estadoModel estado;

    @ManyToMany
    @JoinTable(name = "campus_servidor",
            joinColumns = @JoinColumn(name = "id_Campus"),
            inverseJoinColumns = @JoinColumn(name = "id_Servidor"))
    private List<servidorModel> servidores;

    public campusModel() {
        this.cidade = new cidadeModel();
        this.estado = new estadoModel();
    }

    public String getCampusNome() {
        return campusNome;
    }

    public void setCampusNome(String campusNome) {
        this.campusNome = campusNome;
    }

    public long getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(long idCampus) {
        this.idCampus = idCampus;
    }

    public List<servidorModel> getServidores() {
        return servidores;
    }

    public void setServidores(List<servidorModel> servidores) {
        this.servidores = servidores;
    }

    public cidadeModel getCidade() {
        return cidade;
    }

    public void setCidade(cidadeModel cidade) {
        this.cidade = cidade;
    }

    public estadoModel getEstado() {
        return estado;
    }

    public void setEstado(estadoModel estado) {
        this.estado = estado;
    }

=======
package edu.eventos.ifms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "campus")
public class campusModel {
    
    @Id
    @GeneratedValue
    private long idCampus;
    
    @Column(nullable = false, length = 80)
    private String campusNome;

    public long getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(long idCampus) {
        this.idCampus = idCampus;
    }
    private int campusCidadeId;
    private int campusEstadoId;

    public String getCampusNome() {
        return campusNome;
    }

    public void setCampusNome(String campusNome) {
        this.campusNome = campusNome;
    }

    public int getCampusCidadeId() {
        return campusCidadeId;
    }

    public void setCampusCidadeId(int campusCidadeId) {
        this.campusCidadeId = campusCidadeId;
    }

    public int getCampusEstadoId() {
        return campusEstadoId;
    }

    public void setCampusEstadoId(int campusEstadoId) {
        this.campusEstadoId = campusEstadoId;
    }
    
    public campusModel(){
        this.campusNome = "";
        this.campusCidadeId = 0;
        this.campusEstadoId = 0;
    }
    
>>>>>>> origin/master
}
