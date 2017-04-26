/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.dao;

import br.mack.agendamento.modelo.Usuario;
import java.util.List;

/**
 *
 * @author rabah
 */
public interface UsuarioDAO {
    
    public List<Usuario> findAll();
    public Usuario findById(long id);
    
    
    public Usuario create(Usuario usuario);
    
    public boolean remove(Usuario usuario);
    public boolean removeById(long id);
    
    public boolean update(Usuario usuario);
    
}
