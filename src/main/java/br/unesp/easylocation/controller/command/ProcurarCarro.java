package br.unesp.easylocation.controller.command;

import br.unesp.easylocation.model.Carro;
import br.unesp.easylocation.service.CarroService;
import br.unesp.easylocation.service.ServiceFactory;
import com.google.gson.Gson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author frank
 */
public class ProcurarCarro implements ICommand {

    private CarroService service;

    public ProcurarCarro() {
        this.service = ServiceFactory.getCarroService();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        String page = "index.html";

        Carro c = this.service.findByPlaca(request.getParameter("placa"));

        if (c == null) {
            return null;
        }

        Gson gson = new Gson();
        String jsonData = gson.toJson(c);
        PrintWriter out = response.getWriter();
        try {
            out.println(jsonData);
        } finally {
            out.close();
        }

        return page;
    }

}
