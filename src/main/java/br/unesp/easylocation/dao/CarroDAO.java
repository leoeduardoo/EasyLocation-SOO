package br.unesp.easylocation.dao;

import br.unesp.easylocation.model.Carro;

/**
 * @author frank
 */
public interface CarroDAO {

    final String INSERT_CARRO = "INSERT INTO carro(placa, nome, ano, quilometragem, "
            + "patrimonio, status, max_dias_locacao, marca, categoria_idcategoria) "
            + "VALUES(?,?,?,?,?,?,?,?,?)";

    final String UPDATE_CARRO = "UPDATE carro SET nome = ?, ano = ?, quilometragem = ?, "
            + "patrimonio = ?, status = ?, max_dias_locacao = ?, marca = ?, categoria_idcategoria = ? "
            + "WHERE placa = ?";

    final String FIND_BY_PLACA = "SELECT placa, nome, ano, quilometragem, "
            + "patrimonio, status, max_dias_locacao, marca, categoria_idcategoria "
            + "FROM carro "
            + "WHERE placa = ?";

    public boolean save(Carro carro);

    public boolean update(Carro conta);

    public Carro findByPlaca(String placa);


}
