package br.mack.agendamento.modelo;

/**
 *
 * @author p017416
 */
public class Cliente extends Usuario{ 
    private String endereco;
    private String telefone;
    
    public Cliente() {
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
