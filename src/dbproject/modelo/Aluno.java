/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject.modelo;

import dbproject.dominio.Usuario;

/**
 *
 * @author BI0008
 */
public class Aluno extends Usuario {

    public Aluno() {
        this.cargo = Hierarquia.aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSenha() {
        return super.getSenha(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha); //To change body of generated methods, choose Tools | Templates.
    }

}
