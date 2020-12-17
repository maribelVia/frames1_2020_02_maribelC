<<<<<<< HEAD
package edu.eventos.ifms.repository;

import edu.eventos.ifms.model.alunoModel;
import edu.eventos.ifms.util.hibernateConector;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class alunoRepository {
        private Session session;
    private Transaction transaction;

    public void salvar(alunoModel aluno){
        this.session = hibernateConector.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        this.session.saveOrUpdate(aluno);
        
        this.transaction.commit();
        this.session.close();
    }
    
    public List<alunoModel> buscarTodos(){
        this.session = hibernateConector.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        List<alunoModel> listaDeServidores = this.session.createQuery("from alunoModel").list();
        
        this.transaction.commit();
        this.session.close();
        return listaDeAlunos;
    }
    
    public void remover(long idAluno){
        this.session = hibernateConector.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        alunoModel aluno = (alunoModel) this.session.get(alunoModel.class, idAluno);
        this.session.delete(aluno);
        
        this.transaction.commit();
        this.session.close();
    }
    
    public alunoModel buscarPorId(long idAluno){
        this.session = hibernateConector.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        alunoModel aluno = (alunoModel) this.session.get(alunoModel.class, idAluno);
        
        this.transaction.commit();
        this.session.close();
        return aluno;
    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eventos.ifms.repository;

/**
 *
 * @author Maribel
 */
public class alunoRepository {
    
>>>>>>> origin/master
}
