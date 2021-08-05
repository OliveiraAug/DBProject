/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject.dominio;

/**
 *
 * @author BI0008
 */
public abstract class Usuario {

    public enum Hierarquia {
        professor, aluno, coordenador;
    }
    protected int id;
    public String nome;
    protected String senha;
    public Hierarquia cargo;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
