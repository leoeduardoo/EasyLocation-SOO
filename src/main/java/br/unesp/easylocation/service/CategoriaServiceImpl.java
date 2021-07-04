package br.unesp.easylocation.service;

import br.unesp.easylocation.dao.CategoriaDAO;
import br.unesp.easylocation.dao.DaoFactory;
import br.unesp.easylocation.model.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frank
 */
public class CategoriaServiceImpl implements CategoriaService {

    private CategoriaDAO dao = DaoFactory.getCategoriaDAO();

    @Override
    public boolean save(Categoria entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }

    @Override
    public Categoria findById(Long id) {
        Categoria entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }

    @Override
    public List<Categoria> findAll() {
        List<Categoria> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

}
