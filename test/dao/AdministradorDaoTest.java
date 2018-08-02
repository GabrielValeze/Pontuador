/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120138
 */
public class AdministradorDaoTest {
    
    public AdministradorDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class AdministradorDao.
     */
    @Test
    public void testInserir() {
        NovoUsuarioDao dao = new NovoUsuarioDao();
        Usuario adm = new Usuario("João", "Nelson", "1266");
        dao.inserir(adm);
    }
    
}
