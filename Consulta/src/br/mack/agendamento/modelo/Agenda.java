/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vmrib
 */
@Entity
public class Agenda implements Serializable{
    @Id
    private int id;
    private int tam_consulta;
    private Date dataInicio;
    private Date dataFim;
    
    
    private List<Consulta> consultas;

    public Agenda() {
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsulta(Consulta c){
        consultas.add(c);
    }
    
    public int getTam_consulta() {
        return tam_consulta;
    }

    public void setTam_consulta(int tam_consulta) {
        this.tam_consulta = tam_consulta;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + ", tam_consulta=" + tam_consulta + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", consultas=" + consultas + '}';
    }
    
}
