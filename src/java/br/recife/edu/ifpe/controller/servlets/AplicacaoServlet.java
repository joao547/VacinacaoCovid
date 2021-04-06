/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.recife.edu.ifpe.controller.servlets;

import br.recife.edu.ifpe.model.classes.Aplicacao;
import br.recife.edu.ifpe.model.classes.Paciente;
import br.recife.edu.ifpe.model.classes.ProfissionalEnfermagem;
import br.recife.edu.ifpe.model.classes.Vacina;
import br.recife.edu.ifpe.model.repositorios.RepositorioPaciente;
import br.recife.edu.ifpe.model.repositorios.RepositorioProfissionalEnfermagem;
import br.recife.edu.ifpe.model.repositorios.RepositorioVacina;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joaob
 */
@WebServlet(name = "AplicacaoServlet", urlPatterns = {"/AplicacaoServlet"})
public class AplicacaoServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String descricao = request.getParameter("descricao");
        int pacienteId = Integer.valueOf(request.getParameter("paciente"));
        int profissionalId = Integer.valueOf(request.getParameter("profissionais"));
        int vacinaId = Integer.valueOf(request.getParameter("vacina"));
        ProfissionalEnfermagem profissional = RepositorioProfissionalEnfermagem.getCurrentInstance().read(profissionalId);
        Vacina vacina = RepositorioVacina.getCurrentInstance().read(vacinaId);
        Paciente paciente = RepositorioPaciente.getCurrentInstance().read(pacienteId);
        
        if(vacina.getQuantidadeAplicacoes() > 0){
            vacina.setQuantidadeAplicacoes(vacina.getQuantidadeAplicacoes() - 1);
            Aplicacao aplicacao = new Aplicacao();
            aplicacao.setDescricao(descricao);
            aplicacao.setAplicador(profissional);
            aplicacao.setVacina(vacina);
            
            paciente.add(aplicacao);
        }
    }

}
