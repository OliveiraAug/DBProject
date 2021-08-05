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
public class Coordenador extends Usuario {

    public Coordenador() {
        this.cargo = Hierarquia.coordenador;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Hierarquia getCargo() {
        return cargo;
    }

    public void setCargo(Hierarquia cargo) {
        this.cargo = cargo;
    }

}
