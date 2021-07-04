package br.unesp.easylocation.controller.helper;

import br.unesp.easylocation.controller.command.AtualizarCarro;
import br.unesp.easylocation.controller.command.CadastrarCarro;
import br.unesp.easylocation.controller.command.CadastrarCategoria;
import br.unesp.easylocation.controller.command.ICommand;

/**
 * @author frank
 */
public class Helper {

    private Helper() {
    }

    public static ICommand getCommand(String cmd) {
        ICommand command = null;

        switch (cmd) {
            case "/CadastrarCategoria": {
                System.out.println("Comando criado!");
                command = new CadastrarCategoria();
            }
            break;
            case "/CadastrarCarro": {
                System.out.println("Comando criado!");
                command = new CadastrarCarro();
            }
            break;
            case "/AtualizarCarro": {
                System.out.println("Comando criado!");
                command = new AtualizarCarro();
            }
            break;
            default: {
                System.out.println("Comando não encontrado!");
            }
        }

        return command;
    }

}
