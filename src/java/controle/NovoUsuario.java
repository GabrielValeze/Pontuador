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
@ManagedBean (name="novoUsuario")
@ViewScoped
public class NovoUsuario implements Serializable {
    private  Usuario usuario;
    private Dao<Usuario> dao;
    
    public NovoUsuario( ){
        usuario = new Usuario();
        dao = new Dao(Usuario.class);
    }
    
    public void inserirUsuario(){
        getDao().inserir(getUsuario());
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage (FacesMessage.SEVERITY_INFO,"Usuário cadastrado", null));
        setUsuario(new Usuario());
    }   

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the dao
     */
    public Dao<Usuario> getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(Dao<Usuario> dao) {
        this.dao = dao;
    }
    
}
