package br.unesp.easylocation.dao;

/**
 *
 * @author frank
 */
public class DaoFactory {

    private DaoFactory(){        
    }
    
    public static CategoriaDAO getCategoriaDAO(){
        return new CategoriaDAOImpl();
    }
    
    public static CarroDAO getCarroDAO(){
        return new CarroDAOImpl();
    }
}
