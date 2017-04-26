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
import javax.persistence.OneToMany;

/**
 *
 * @author vmrib
 */
@Entity
public class Consultorio implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String endereco;
    
    @OneToMany
    private List<Agenda> agendas;


    public Consultorio() {
    }
    
    public List<Agenda> getAgendas() {
        return agendas;
    }
    
    public void addAgenda(Agenda a){
        agendas.add(a);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Consultorio{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", agendas=" + agendas + '}';
    }

    
    
}
