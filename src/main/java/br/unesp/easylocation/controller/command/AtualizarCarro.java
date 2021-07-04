package br.unesp.easylocation.controller.command;

import br.unesp.easylocation.model.Carro;
import br.unesp.easylocation.model.Categoria;
import br.unesp.easylocation.service.CarroService;
import br.unesp.easylocation.service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author frank
 */
public class AtualizarCarro implements ICommand {

    private CarroService service;

    public AtualizarCarro() {
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

        Carro c = new Carro();
        c.setPlaca(placa);
        c.setNome(nome);
        c.setAno(Integer.parseInt(ano));
        c.setMarca(marca);
        c.setQuilometragem(Double.parseDouble(quilometragem));
        c.setMaxDiasLocacao(Integer.parseInt(maxDiasLocacao));
        c.setStatus(status);

        boolean value = false;
        if (patrimonio.equals("A")) {
            value = true;
        }
        c.setPatrimonio(value);

        Categoria cat = new Categoria();
        cat.setIdCategoria(Long.parseLong(categoria));
        c.setCategoria(cat);

        boolean b = this.service.save(c);

        return page;
    }

}
