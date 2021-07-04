/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.easylocation.service;

import br.unesp.easylocation.model.Carro;

/**
 * @author frank
 */
public interface CarroService {

    boolean save(Carro entity);

    boolean update(Carro entity);

    Carro findByPlaca(String placa);

}
