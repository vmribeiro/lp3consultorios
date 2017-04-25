/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author vmrib
 */
@Entity
public class Medico extends Usuario implements Serializable{
    private String crm;
    private Agenda agenda;

    public String getCrm() {
        return crm;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }   
    
    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString()+ "{\nMedico{" + "crm=" + crm + "\n}";
    }
}
