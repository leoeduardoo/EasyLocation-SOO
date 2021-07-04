package br.unesp.easylocation.dao;

import br.unesp.easylocation.model.Categoria;
import java.util.List;

/**
 *
 * @author frank
 */
public interface CategoriaDAO {

    final String INSERT_CATEGORIA = "INSERT INTO categoria(nome, descricao, "
            + "preco_diaria) VALUES(?, ?, ?)";

    final String FIND_BY_ID = "SELECT id_categoria, nome, descricao, preco_diaria "
            + "FROM categoria WHERE id_categoria = ?";

    final String FIND_ALL = "SELECT id_categoria, nome, descricao, preco_diaria "
            + "FROM categoria";

    public boolean save(Categoria categoria);

    public Categoria findById(Long idCategoria);

    public List<Categoria> findAll();

}
