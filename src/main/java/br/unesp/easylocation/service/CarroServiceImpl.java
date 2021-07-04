package br.unesp.easylocation.service;

import br.unesp.easylocation.dao.CarroDAO;
import br.unesp.easylocation.dao.DaoFactory;
import br.unesp.easylocation.model.Carro;

/**
 * @author frank
 */
public class CarroServiceImpl implements CarroService {

    private CarroDAO dao = DaoFactory.getCarroDAO();

    @Override
    public boolean save(Carro entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }

    @Override
    public boolean update(Carro entity) {
        boolean b = false;

        if (entity != null) {
            b = dao.update(entity);
        }

        return b;
    }

    @Override
    public Carro findByPlaca(String placa) {
        return dao.findByPlaca(placa);
    }

}
