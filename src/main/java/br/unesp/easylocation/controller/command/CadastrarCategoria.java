package br.unesp.easylocation.controller.command;

import br.unesp.easylocation.model.Categoria;
import br.unesp.easylocation.service.CategoriaService;
import br.unesp.easylocation.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author frank
 */
public class CadastrarCategoria implements ICommand {
    
    private CategoriaService service;

    public CadastrarCategoria() {
        this.service = ServiceFactory.getCategoriaService();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "index.html";

        String nome = request.getParameter("nome");
        String preco = request.getParameter("preco");
        String descricao = request.getParameter("descricao");
        System.out.println("Dados: " + nome + " - " + preco + " - " + descricao);
        
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        categoria.setPrecoDiaria(Double.parseDouble(preco));
        categoria.setDescricao(descricao);
        System.out.println("CATEGORIA: " + categoria);
                
        boolean b = service.save(categoria);        
        
        return page;
    }

}
