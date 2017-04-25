/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.util.List;

/**
 *
 * @author vmrib
 */
public class Consultorio {
    private String nome;
    private String endereco;
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

    @Override
    public String toString() {
        return "Consultorio{" + "nome=" + nome + ", endereco=" + endereco + '}';
    }
    
}
