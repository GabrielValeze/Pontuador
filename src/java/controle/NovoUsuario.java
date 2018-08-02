/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.NovoUsuarioDao;
import dao.Dao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;

/**
 *
 * @author a120138
 */
@ManagedBean (name="usuario")
@ViewScoped
public class NovoUsuario implements Serializable {
    private  Usuario usuario;
    private Dao<Usuario> dao;
    
    public NovoUsuario( ){
        usuario = new Usuario();
        dao = new Dao(Usuario.class);
    }
    
    public void inserirUsuario(){
        dao.inserir(usuario);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO,"Usuário cadastrado", null));
        usuario = new Usuario();
    }   
    
}
