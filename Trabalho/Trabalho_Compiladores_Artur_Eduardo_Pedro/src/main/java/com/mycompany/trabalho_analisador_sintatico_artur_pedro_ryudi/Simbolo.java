package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;

public class Simbolo {
    private String nome;
    private String categoria;
    private int atributo;

    public Simbolo(String nome, String categoria, int atributo) {
        this.atributo = atributo;
        this.categoria = categoria;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getAtributo() {
        return atributo;
    }
    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
}
