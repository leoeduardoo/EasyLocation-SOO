package br.unesp.easylocation.controller.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author frank
 */
public interface ICommand {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
