package br.unesp.easylocation.controller.command;

import br.unesp.easylocation.model.Carro;
import br.unesp.easylocation.model.Categoria;
import br.unesp.easylocation.service.CarroService;
import br.unesp.easylocation.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author frank
 */
public class CadastrarCarro implements ICommand {

    private CarroService service;

    public CadastrarCarro() {
        this.service = ServiceFactory.getCarroService();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "index.html";

        String placa = request.getParameter("placa");
        String nome = request.getParameter("nome");
        String ano = request.getParameter("ano");
        String marca = request.getParameter("marca");
        String quilometragem = request.getParameter("quilometragem");
        String maxDiasLocacao = request.getParameter("maxDiasLocacao");
        String status = request.getParameter("status");
        String patrimonio = request.getParameter("patrimonio");
        String categoria = request.getParameter("categoria");

        System.out.println("DADOS: "
                + placa + " - "
                + nome + " - "
                + ano + " - "
                + marca + " - "
                + quilometragem + " - "
                + maxDiasLocacao + " - "
                + status + " - "
                + patrimonio + " - "
                + categoria
        );

        Carro car = new Carro();
        car.setPlaca(placa);
        car.setNome(nome);
        car.setAno(Integer.parseInt(ano));
        car.setMarca(marca);
        car.setQuilometragem(Double.parseDouble(quilometragem));
        car.setMaxDiasLocacao(Integer.parseInt(maxDiasLocacao));
        car.setStatus(status);

        boolean value = false;
        if (patrimonio.equals("A")) {
            value = true;
        }
        car.setPatrimonio(value);

        Categoria cat = new Categoria();
        cat.setIdCategoria(Long.parseLong(categoria));
        car.setCategoria(cat);
        
        boolean b = this.service.save(car);

        return page;
    }

}
