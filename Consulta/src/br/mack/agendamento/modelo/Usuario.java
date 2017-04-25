/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vmrib
 */
@Entity
public class Usuario implements Serializable{
    @Id
    protected long id;
    protected String email;
    protected String senha;
    protected String login;
    protected String nome;
    protected String cpf;
    protected boolean isMedico;
    
    //Um usuario pode acessar sua agenda, caso seja médico essa será a agenda com todas as consultas
    protected Agenda agenda;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    
    public boolean isIsMedico() {
        return isMedico;
    }

    public void setIsMedico(boolean isMedico) {
        this.isMedico = isMedico;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", senha=" + senha + ", login=" + login + ", nome=" + nome + ", cpf=" + cpf + ", isMedico=" + isMedico + ", agenda=" + agenda + '}';
    }

    
}
