
package edu.eventos.ifms.controller;

import br.com.jsfinicio.model.ProfessorModel;
import br.com.jsfinicio.repository.ProfessorRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProfessorController {
    
    private ProfessorModel professorModel;
    private ProfessorRepository professorRepository;
    private List<ProfessorModel> listaDeProfessores;
    
    public ProfessorController(){
        this.professorModel = new ProfessorModel();
        this.professorRepository = new ProfessorRepository();
        this.listaDeProfessores = new ArrayList<>();
    }
    
    public void salvar(){
        this.professorRepository.salvar(this.professorModel);
    }
    
    public void buscarTodos(){
        this.listaDeProfessores = this.professorRepository.buscarTodos();
    }

    public ProfessorModel getProfessorModel() {
        return professorModel;
    }

    public void setProfessorModel(ProfessorModel professorModel) {
        this.professorModel = professorModel;
    }

    public ProfessorRepository getProfessorRepository() {
        return professorRepository;
    }

    public void setProfessorRepository(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorModel> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<ProfessorModel> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }
    
    
}
