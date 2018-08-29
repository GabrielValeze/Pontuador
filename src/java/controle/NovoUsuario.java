package controle;

import dao.NovoUsuarioDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;

// @author Gabriel Valeze
 
@ManagedBean(name = "novoUsuario")
@ViewScoped
public class NovoUsuario implements Serializable {

    private Usuario usuario;
    private List<Usuario> lista;
    private NovoUsuarioDao dao;

    public NovoUsuario() {
        usuario = new Usuario();
        dao = new NovoUsuarioDao();
        lista = dao.listarTodos();
    }

    public void inserirUsuario() {
        getDao().inserir(getUsuario());
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuário cadastrado", null));
        setUsuario(new Usuario());
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public NovoUsuarioDao getDao() {
        return dao;
    }

    public void setDao(NovoUsuarioDao dao) {
        this.dao = dao;
    }
    
}