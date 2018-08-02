package dao;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
}