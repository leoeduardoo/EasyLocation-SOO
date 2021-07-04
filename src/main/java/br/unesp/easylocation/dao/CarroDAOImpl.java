package br.unesp.easylocation.dao;

import br.unesp.easylocation.model.Carro;
import br.unesp.easylocation.model.Categoria;
import br.unesp.easylocation.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author frank
 */
public class CarroDAOImpl implements CarroDAO {

    @Override
    public boolean save(Carro carro) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_CARRO);
                pstm.setString(1, carro.getPlaca());
                pstm.setString(2, carro.getNome());
                pstm.setInt(3, carro.getAno());
                pstm.setDouble(4, carro.getQuilometragem());
                pstm.setBoolean(5, carro.isPatrimonio());
                pstm.setString(6, carro.getStatus());
                pstm.setInt(7, carro.getMaxDiasLocacao());
                pstm.setString(8, carro.getMarca());
                pstm.setLong(9, carro.getCategoria().getIdCategoria());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }

    @Override
    public boolean update(Carro carro) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {

                con.setAutoCommit(false);

                pstm = con.prepareStatement(UPDATE_CARRO);
                pstm.setString(2, carro.getNome());
                pstm.setInt(3, carro.getAno());
                pstm.setDouble(4, carro.getQuilometragem());
                pstm.setBoolean(5, carro.isPatrimonio());
                pstm.setString(6, carro.getStatus());
                pstm.setInt(7, carro.getMaxDiasLocacao());
                pstm.setString(8, carro.getMarca());
                pstm.setLong(9, carro.getCategoria().getIdCategoria());

                pstm.executeUpdate();

                con.commit();
                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }

    @Override
    public Carro findByPlaca(String placa) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Carro carro = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_PLACA);
                pstm.setString(1, placa);
                res = pstm.executeQuery();

                while (res.next()) {
                    carro = new Carro();

                    pstm.setString(1, carro.getPlaca());
                    pstm.setString(2, carro.getNome());
                    pstm.setInt(3, carro.getAno());
                    pstm.setDouble(4, carro.getQuilometragem());
                    pstm.setBoolean(5, carro.isPatrimonio());
                    pstm.setString(6, carro.getStatus());
                    pstm.setInt(7, carro.getMaxDiasLocacao());
                    pstm.setString(8, carro.getMarca());
                    pstm.setLong(9, carro.getCategoria().getIdCategoria());

                    carro.setPlaca(res.getString(1));
                    carro.setNome(res.getString(2));
                    carro.setAno(res.getInt(3));
                    carro.setQuilometragem(res.getDouble(4));
                    carro.setPatrimonio(res.getBoolean(5));
                    carro.setStatus(res.getString((6)));
                    carro.setMaxDiasLocacao(res.getInt((7)));
                    carro.setMarca(res.getString((8)));
                    carro.setCategoria(res.getObject(9, Categoria.class));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return carro;
    }

}
