package br.unesp.easylocation.service;

/**
 *
 * @author frank
 */
public class ServiceFactory {
    
    private ServiceFactory(){        
    }
    
    public static CategoriaService getCategoriaService(){
        return new CategoriaServiceImpl();
    }
    
    public static CarroService getCarroService(){
        return new CarroServiceImpl();
    }
}
