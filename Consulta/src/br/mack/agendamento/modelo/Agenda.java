/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author vmrib
 */
@Entity
public class Agenda implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
  
    
//    @OneToMany(orphanRemoval=true)
//    @JoinColumn(name="AGENDA_ID")
    @OneToMany(orphanRemoval=true)
    @JoinColumn(name="AGENDA_ID")
    private List<Consulta> consultas;

    public Agenda() {
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsulta(Consulta c){
        consultas.add(c);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
