/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author vmrib
 */
public class Consulta {
    private int horario;
    private Date dataConsulta;
    private String status;
    
    private List<Cliente> clientes;

    public Consulta() {
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void addCliente(Cliente c){
        clientes.add(c);
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consulta{" + "horario=" + horario + ", dataConsulta=" + dataConsulta + ", status=" + status + '}';
    }
}
