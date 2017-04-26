/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.agendamento.dao;

/**
 *
 * @author rabah
 */
public class UsuarioDAOFactory {
    
    
    public UsuarioDAOFactory(){}
    
    public static UsuarioDAO getUsuarioDAO(){
        return new UsuarioDAOJPAImpl();
    }
    
}
