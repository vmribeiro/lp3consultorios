package br.mack.agendamento.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author p017416
 */
@Entity
public class Cliente extends Usuario implements Serializable{ 
    private String endereco;
    private String telefone;
    
    
       @OneToMany(orphanRemoval=true)
    @JoinColumn(name="CLIENTE_ID")
    private List<Consulta> consultas;
    
    public Cliente() {
        consultas = new ArrayList<>();
    }   
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public List<Consulta> getConsultas(){
        return this.consultas;
    }
    
    
    public void setConstultas(List<Consulta> consultas){
        this.consultas = consultas;
    }
    
    public void addConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    
    @Override
    public boolean equals(Object o){
        Cliente aux = null;
        if(o instanceof Cliente){
            aux = (Cliente)o;
            if(this.nome == aux.nome)
                return true;
        }
           
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "{\nCliente{" + "endereco=" + endereco + ", telefone=" + telefone + "\n}";
    }

    
}
