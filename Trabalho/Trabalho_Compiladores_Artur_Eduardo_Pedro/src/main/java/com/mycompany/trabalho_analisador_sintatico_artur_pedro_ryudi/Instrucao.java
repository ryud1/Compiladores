package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;

public class Instrucao {

    
    private int numero;
    private String codigo;
    private String param;

    public Instrucao(int numero, String codigo, String param) {
        this.codigo = codigo;
        this.numero = numero;
        this.param = param;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }
    
}
