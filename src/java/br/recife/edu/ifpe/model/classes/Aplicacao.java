/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.recife.edu.ifpe.model.classes;

import java.util.Date;

public class Aplicacao {
    
    private int id;
    private Date data;
    private int hora;
    private String descricao;
    private ProfissionalEnfermagem aplicador;
    private Vacina vacina;
    
    public Aplicacao(){
        this.data = new Date();
        this.hora = this.data.getHours();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProfissionalEnfermagem getAplicador() {
        return aplicador;
    }

    public void setAplicador(ProfissionalEnfermagem aplicador) {
        this.aplicador = aplicador;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
    
}
