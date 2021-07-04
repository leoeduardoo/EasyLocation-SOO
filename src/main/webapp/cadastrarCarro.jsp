<%@page import="br.unesp.easylocation.service.ServiceFactory"%>
<%@page import="br.unesp.easylocation.model.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="br.unesp.easylocation.service.CategoriaService"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>:: Sistemas Orientados a Objetos 2020 - Prof. Dr. Frank J. Affonso</title>
        <link rel="stylesheet" href="foundation-sites-6.6.3-CSS/assets/css/foundation.css" />        
        <link rel="stylesheet" href="foundation-sites-6.6.3-CSS/assets/css/app.css" />
    </head>

    <%!
        CategoriaService categoriaService = ServiceFactory.getCategoriaService();
    %>

    <body>
        <!-- TOPO DA PÁGINA-->
        <div id="topo">
            <div class="background">
                <div class="grid-container">
                    <div class="grid-x grid-margin-x">
                        <div class="cell small-10">
                            <a href="index.html"><h2 class="whiteBold">EasyLocation</h2></a>
                            <h3 class="white">Sua Locadora para Rio Claro e Região</h3>
                        </div>
                        <div class="cell small-2">
                            <p class="right marginTop"><button class="button warning expanded" data-open="exampleModal1">Sobre</button></p>

                            <div class="reveal" id="exampleModal1" data-reveal>
                                <h1>Locadora Web</h1>
                                <p class="lead">Prof. Dr. Frank J. Affonso.</p>
                                <p>Projeto criado com ZURB Foundation 6.6.3.</p>
                                <button class="close-button" data-close aria-label="Close modal" type="button">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                        </div>

                        <div class="cell small-12">
                            <div class="heigh100">                                
                            </div>
                        </div>
                        <div class="cell small-12">
                            <ul class="dropdown menu" data-dropdown-menu>
                                <li>
                                    <a class="white" href="#">Menu</a>
                                    <ul class="menu">
                                        <li><a href="cadastrarCategoria.html">Cadastrar Categoria</a></li>
                                        <li><a href="cadastrarCarro.jsp">Cadastrar Carro</a></li>                                        
                                    </ul>
                                </li>                                
                            </ul>
                        </div>                                           
                    </div>
                </div> 
            </div>
        </div>
        <!-- TOPO DA PÁGINA-->


        <!-- CORPO DA PÁGINA-->        
        <div class="grid-container">
            <div class="grid-x grid-margin-x">
                <div class="cell small-12">
                    <hr>
                </div>
                <div class="cell small-12">
                    <h3 class="center">CADASTRAR CARRO
                </div>

                <div class="cell small-12">
                    <form data-abide novalidate action="CadastrarCarro">
                        <div data-abide-error class="alert callout" style="display: none;">
                            <p><i class="fi-alert"></i> ATENÇÃO! Preencha corretamente o formulário!</p>
                        </div>
                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-3">
                                    <label class="size">Placa
                                        <input name="placa" type="text" placeholder="Placa do carro" required>
                                        <span class="form-error">
                                            Atenção! Este campo é obrigatório!
                                        </span>
                                    </label>
                                </div>
                                <div class="cell small-9">
                                    <label class="size">Nome
                                        <input name="nome" type="text" placeholder="Nome do carro" required pattern="alpha_numeric">
                                        <span class="form-error">
                                            Atenção! Este campo é obrigatório!
                                        </span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-3">
                                    <label class="size">Ano
                                        <input name="ano" type="text" placeholder="Ano" required pattern="number">
                                        <span class="form-error">
                                            Atenção! Este campo é numérico e obrigatório!
                                        </span>
                                    </label>
                                </div>
                                <div class="cell small-3">
                                    <label class="size">Marca
                                        <input name="marca" type="text" placeholder="Marca do carro" required pattern="alpha_numeric">
                                        <span class="form-error">
                                            Atenção! Este campo é obrigatório!
                                        </span>
                                    </label>
                                </div>
                                <div class="cell small-3">
                                    <label class="size">Quilometragem atual
                                        <input name="quilometragem" type="text" placeholder="Quilometragem atual" required pattern="number">
                                        <span class="form-error">
                                            Atenção! Este campo é numérico e obrigatório!
                                        </span>
                                    </label>
                                </div>
                                <div class="cell small-3">
                                    <label class="size">Máximo de dias locação
                                        <input name="maxDiasLocacao" type="text" placeholder="Número máximo de dias para locação" required pattern="number">
                                        <span class="form-error">
                                            Atenção! Este campo é numérico e obrigatório!
                                        </span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-6">                                    
                                    <fieldset class="fieldset">
                                        <legend>Status</legend>
                                        <input name="status" type="radio" value="D" checked><label > Disponível </label>
                                        <input name="status" type="radio" value="A"><label > Alugado </label>                                        
                                        <input name="status" type="radio" value="M"><label > Em manutenção </label>                                        
                                    </fieldset>                                  
                                </div>
                                <div class="cell small-6">                                    
                                    <fieldset class="fieldset">
                                        <legend>Patrimônio</legend>
                                        <input name="patrimonio" type="radio" value="A" checked><label > Ativo </label>
                                        <input name="patrimonio" type="radio" value="D"><label > Inativo </label>                                                                                
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-12">
                                    <label class="size">Categoria
                                        <select name="categoria">
                                            <option value="0">-- SELECIONE UMA CATEGORIA --</option>   
                                            <%
                                                List<Categoria> lista = categoriaService.findAll();
                                                for (Categoria c : lista) {
                                            %>
                                            <option value="<%= c.getIdCategoria()%>"><%=c.toString()%></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </label>
                                </div>
                            </div>
                        </div>

                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-3">
                                    &nbsp;
                                </div>
                            </div>
                        </div>
                        <div class="grid-container">
                            <div class="grid-x grid-padding-x">
                                <div class="cell small-3">

                                </div>
                                <div class="cell small-3">
                                    <button type="submit" class="hollow button expanded">Cadastrar</button>
                                </div>
                                <div class="cell small-3">
                                    <button type="reset" class="hollow button expanded">Limpar</button>                                    
                                </div>
                                <div class="cell small-3">

                                </div>
                            </div>
                        </div>
                    </form>                    
                </div>


                <div class="cell small-12">
                    <hr>
                </div>
            </div>
        </div>
        <!-- CORPO DA PÁGINA-->

        <!-- RODAPÉ DA PÁGINA-->
        <div id="rodape">
            <div  class="fundoCinza5px"> &nbsp; </div>
            <!-- INSERINDO CARDS..-->
            <!-- INSERINDO OS CARDS DE ENDEREÇO E CONTATO-->
            <div  class="fundoPreto">
                <div class="fundoPreto20px">

                </div>
                <div class="grid-container">
                    <div class="grid-x grid-margin-x">
                        <div class="cell medium-4">
                            <p class="whiteBold"> Nosso Endereço </p>
                            <hr>
                            <p class = "white"> Avenida 24A, no 1515 </p>
                            <p class = "white"> CEP: 13506-900 </p>
                            <p class = "white"> Bairro: Bela Vista </p>
                            <p class = "white"> Rio Claro - SP </p>
                            <p class = "white"> Cx Postal: 178 </p>                            
                        </div>
                        <div class="cell medium-4">
                            <p class="whiteBold"> Atendimento </p>
                            <hr>
                            <!-- INSERINDO O MODAL DE CONTATO-->                                                                          
                            <p> <a class="white" data-open="exampleModal2"> <img src="images/rodape/form.png" width="16" height="16" alt="form"/> Serviço de atendimento ao consumidor </a> </p>

                            <div class="reveal fundoPreto" id="exampleModal2" data-reveal>
                                <div class="fundoPreto">
                                    <h2 class="white"> Contato </h2>
                                    <form action="#">
                                        <div class="cell small-4">
                                            <label class="white">Nome completo: *
                                                <input type="text" placeholder="Digite seu nome completo">
                                            </label>
                                        </div>
                                        <div class="cell small-4">
                                            <label class="white">E-mail: *
                                                <input type="email" placeholder="Digite seu e-mail">
                                            </label>
                                        </div>
                                        <div class="cell small-4">
                                            <label class="white">Mensagem: *
                                                <textarea placeholder="Digite sua dúvida/sugestão" rows="4"></textarea>
                                            </label>
                                        </div>
                                        <div class="contact-panel-actions">
                                            <button class="hollow button alert">Cancelar</button> &nbsp;&nbsp;&nbsp;&nbsp;
                                            <button class="hollow button">Enviar</button>                                        
                                        </div>
                                    </form>
                                </div>
                            </div>

                            <p class = "white"> <img src="images/rodape/phone.png" width="16" height="16" alt="phone"/> (19) 3333-4444 </p>
                            <p class = "white"> <img src="images/rodape/mobile.png" width="16" height="16" alt="mobile"/> (19) 98888-7777 </p>
                            <p class = "white"> 
                                <img src="images/rodape/email.png" width="16" height="16" alt="email"/> <a class="white" href="mailto:sac@easylocation.com">sac@easylocation.com</a> 
                            </p>                            
                        </div>
                        <div class="cell medium-4">
                            <p class="whiteBold"> Certificado de Qualidade </p>
                            <hr>
                            <img class="float-center" src="images/rodape/quality.png" width="200" height="200" alt="quality"/>
                        </div>
                    </div>
                </div>                    
            </div>
        </div>
        <!-- RODAPÉ DA PÁGINA-->

        <script src="foundation-sites-6.6.3-CSS/assets/js/vendor.js"></script>
        <script src="foundation-sites-6.6.3-CSS/assets/js/foundation.js"></script>
        <script>
            $(document).foundation();
        </script>

    </body>
</html>