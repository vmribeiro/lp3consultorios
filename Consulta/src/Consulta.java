
import br.mack.agendamento.dao.UsuarioDAO;
import br.mack.agendamento.dao.UsuarioDAOFactory;
import br.mack.agendamento.modelo.Medico;
import br.mack.agendamento.modelo.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rabah
 */
public class Consulta {
    public static void main(String[] args) {
        Medico u = new Medico();
        u.setCpf("123");
        u.setEmail("email@email");
        u.setLogin("rabah");
        u.setSenha("rabah");
        u.setCrm("123321");
        
        
        
        
        UsuarioDAO dao = UsuarioDAOFactory.getUsuarioDAO();
        dao.create(u);
    }
}
