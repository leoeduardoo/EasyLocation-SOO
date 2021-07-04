package br.unesp.easylocation.dao;

import br.unesp.easylocation.model.Categoria;
import br.unesp.easylocation.utils.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frank
 */
public class CategoriaDAOImpl implements CategoriaDAO {

    public CategoriaDAOImpl() {
    }

    @Override
    public boolean save(Categoria categoria) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;        

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {                                
                pstm = con.prepareStatement(INSERT_CATEGORIA, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, categoria.getNome());
                pstm.setString(2, categoria.getDescricao());
                pstm.setDouble(3, categoria.getPrecoDiaria());
                pstm.executeUpdate();
                
                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }

    @Override
    public Categoria findById(Long idCategoria) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Categoria categoria = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idCategoria);
                res = pstm.executeQuery();

                while (res.next()) {
                    categoria = new Categoria();
                    categoria.setIdCategoria(res.getLong(1));
                    categoria.setNome(res.getString(2));
                    categoria.setDescricao(res.getString(3));
                    categoria.setPrecoDiaria(res.getDouble(4));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return categoria;
    }

    @Override
    public List<Categoria> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Categoria> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Categoria categoria = new Categoria();
                    categoria.setIdCategoria(res.getLong(1));
                    categoria.setNome(res.getString(2));
                    categoria.setDescricao(res.getString(3));
                    categoria.setPrecoDiaria(res.getDouble(4));
                    
                    lista.add(categoria);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    }

}
