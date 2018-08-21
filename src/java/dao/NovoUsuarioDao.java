package dao;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import modelo.Usuario;
import util.JpaUtil;

public class NovoUsuarioDao implements Serializable { 
    
    public boolean inserir(Usuario user) {
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(user);
        tx.commit();
        manager.close();
        return true;
    } 
    
     public Usuario autenticar(Usuario usuario){
        Usuario temp = null; // administrador retornado na consulta ao banco
        EntityManager manager = JpaUtil.getEntityManager();
        TypedQuery<Usuario> query = manager.createQuery("SELECT a FROM Usuario a WHERE a.login = :login AND a.senha = :senha",
                Usuario.class); 
        query.setParameter("login", usuario.getLogin());
        query.setParameter("senha", usuario.getSenha());
        try{
            temp = query.getSingleResult(); 
        }
        catch(Exception e){ 
            
        }     //aqui poderia haver um tratamento de exceção mais decente
        finally{
            manager.close();
        }        
        return temp;
}
}