package controle;

import dao.UsuarioDao;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

// @author Gabriel Valeze

@ManagedBean (name="login")
@ViewScoped
public class LoginMB implements Serializable{
    private Usuario usuario;
    
    public LoginMB(){
        usuario = new Usuario();
    }
    
    public String autenticar(){
        UsuarioDao user = new UsuarioDao();
        Usuario temp;
        temp = user.autenticar(usuario);
        if (temp == null){  // se houver erro, método autenticar no dao retorna null
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null));
            return null;  //fica na página
        }  
        //seta usuario na Sessao
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(true);
        session.setAttribute("usuarioLogado", temp);        
        return "/TelaPerguntas/perguntas";    // menu.xhtml
    }
    
      public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}