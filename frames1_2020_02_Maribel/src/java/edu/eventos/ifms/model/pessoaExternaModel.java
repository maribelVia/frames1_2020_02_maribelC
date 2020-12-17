package edu.eventos.ifms.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "pessoaExterna")
public abstract class pessoaExternaModel extends pessoaModel implements Serializable{

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
    
  @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idCidade", insertable = true, updatable = true)
    private cidadeModel cidade;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idEstado", insertable = true, updatable = true)
    private estadoModel estado;
    
}
