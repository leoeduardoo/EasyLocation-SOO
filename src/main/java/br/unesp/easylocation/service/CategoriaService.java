/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.easylocation.service;

import br.unesp.easylocation.model.Categoria;
import java.util.List;

/**
 *
 * @author frank
 */
public interface CategoriaService {

    List<Categoria> findAll();

    Categoria findById(Long id);

    boolean save(Categoria entity);
    
}
