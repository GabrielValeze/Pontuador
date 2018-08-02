/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
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
public class DaoTest {
    
    public DaoTest() {
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
     * Test of alterar method, of class Dao.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Object objeto = null;
        Dao instance = null;
        Object expResult = null;
        Object result = instance.alterar(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorCodigo method, of class Dao.
     */
    @Test
    public void testBuscarPorCodigo() {
        System.out.println("buscarPorCodigo");
        Object id = null;
        Dao instance = null;
        Object expResult = null;
        Object result = instance.buscarPorCodigo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class Dao.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Integer id = null;
        Dao instance = null;
        instance.excluir(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class Dao.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Object objeto = null;
        Dao instance = null;
        instance.inserir(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodos method, of class Dao.
     */
    @Test
    public void testListarTodos() {
        System.out.println("listarTodos");
        Dao instance = null;
        List expResult = null;
        List result = instance.listarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
