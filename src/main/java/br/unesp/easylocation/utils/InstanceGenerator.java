package br.unesp.easylocation.utils;

import br.unesp.easylocation.model.Categoria;

/**
 *
 * @author frank
 */
public class InstanceGenerator {
    
    private InstanceGenerator(){
        
    }
    
    public static Categoria getCategoria(String nome, double preco, String descricao){
        Categoria c = new Categoria();
        
        c.setNome(nome);
        c.setPrecoDiaria(preco);
        c.setDescricao(descricao);
        
        return c;
    }
    
}
