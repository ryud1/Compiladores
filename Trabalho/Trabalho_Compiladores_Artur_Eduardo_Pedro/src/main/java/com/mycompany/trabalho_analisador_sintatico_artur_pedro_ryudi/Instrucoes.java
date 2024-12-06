package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;

import java.util.Objects;

public class Instrucoes {

    private static String erroSemantico = "";

    public static void add(Tela2 t){
        if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
            if(t.getPilhaTipos().get(t.getTopoExec()-1) == 1){
                t.getPilhaExec().set(t.getTopoExec()-2,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-2)) + Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1))));
            }else{
                t.getPilhaExec().set(t.getTopoExec()-2,Float.toString(Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-2)) + Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1))));
            }
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void alb(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<=t.getTopoExec()+ desl;i++){
            t.getPilhaExec().addLast("false");
            t.getPilhaTipos().addLast(4);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ali(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<=t.getTopoExec()+ desl;i++){
            t.getPilhaExec().addLast("0");
            t.getPilhaTipos().addLast(1);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void alr(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<=t.getTopoExec()+ desl;i++){
            t.getPilhaExec().addLast("0.0");
            t.getPilhaTipos().addLast(2);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void als(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<=t.getTopoExec()+ desl;i++){
            t.getPilhaExec().addLast("");
            t.getPilhaTipos().addLast(3);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void stc(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()-desl;i<=t.getTopoExec()-1;i++){
            t.getPilhaExec().set(i-1, t.getPilhaExec().getLast());
        }
        t.setTopoExec(t.getTopoExec()-1);
        t.getPilhaExec().removeLast();
        t.getPilhaTipos().removeLast();
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldi(Tela2 t, String constante){
        t.getPilhaExec().addLast(constante);
        t.getPilhaTipos().addLast(1);
        t.setTopoExec(t.getTopoExec() + 1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldb(Tela2 t, String constante){
        t.getPilhaExec().addLast(constante);
        t.getPilhaTipos().addLast(4);
        t.setTopoExec(t.getTopoExec() + 1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldv(Tela2 t, Integer endereco){
        t.getPilhaExec().addLast(t.getPilhaExec().get(endereco-1));
        t.getPilhaTipos().addLast(t.getPilhaTipos().get(endereco-1));
        t.setTopoExec(t.getTopoExec()+1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void jmt(Tela2 t, Integer endereco){
        if("true".equals(t.getPilhaExec().get(t.getTopoExec()))){
            t.setPonteiroExec(endereco-1);
        }else{
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        t.setTopoExec(t.getTopoExec()-1);
        t.getPilhaExec().removeLast();
        t.getPilhaTipos().removeLast();

    }

    public static void bge(Tela2 t){
        if((t.getPilhaTipos().get(t.getTopoExec()-1) == 1 && t.getPilhaTipos().get(t.getTopoExec()) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-1) == 2 && t.getPilhaTipos().get(t.getTopoExec()) == 2)){
            String valor = Float.parseFloat(t.getPilhaExec().get(t.getTopoExec() - 1)) >= Float.parseFloat(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec() - 1, valor);
            t.setTopoExec(t.getTopoExec() - 1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void bgr(Tela2 t){
        if((t.getPilhaTipos().get(t.getTopoExec()-1) == 1 && t.getPilhaTipos().get(t.getTopoExec()) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-1) == 2 && t.getPilhaTipos().get(t.getTopoExec()) == 2)){
            String valor = Float.parseFloat(t.getPilhaExec().get(t.getTopoExec() - 1)) > Float.parseFloat(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec() - 1, valor);
            t.setTopoExec(t.getTopoExec() - 1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void dif(Tela2 t){
        if(Objects.equals(t.getPilhaTipos().get(t.getTopoExec()), t.getPilhaTipos().get(t.getTopoExec()-1))){
            String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) == Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec()-1, valor);
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void div(Tela2 t){
            if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
                if(t.getTopoExec() == '0'){
                    erroSemantico = "Runtime error: divisão por 0";
                }
                if(t.getPilhaTipos().get(t.getTopoExec()-1) == 1){
                    t.getPilhaExec().set(t.getTopoExec()-1,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-2)) + Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1))));
                }else{
                    t.getPilhaExec().set(t.getTopoExec()-1,Float.toString(Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-2)) + Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1))));
                }
                t.setTopoExec(t.getTopoExec()-1);
                t.getPilhaExec().removeLast();
                t.getPilhaTipos().removeLast();
                t.setPonteiroExec(t.getPonteiroExec()+1);
            }
            else{
                erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
            }
}

    public static void eql(Tela2 t){
        if(Objects.equals(t.getPilhaTipos().get(t.getTopoExec()-1), t.getPilhaTipos().get(t.getTopoExec()-2))){
            String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-2)) == Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec()-2, valor);
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void jmf(Tela2 t, int endereco){
        if(t.getPilhaExec().get(t.getTopoExec()-1).equals("false")){
            t.setPonteiroExec(endereco);
        }else{
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        t.setTopoExec(t.getTopoExec()-1);
        t.getPilhaExec().removeLast();
        t.getPilhaTipos().removeLast();
    }

    public static void jmp(Tela2 t, int endereco){
        t.setPonteiroExec(endereco);
    }

    public static void rea(Tela2 t, Terminal terminal, int tipo){
        terminal.askInput();
        terminal.requestFocus();
        t.setCheckpintRea(t.getPonteiroExec()+1);
        t.setCheckpointTipRea(tipo);
    }

    //VOLTALHA

    public static void and(Tela2 t) {
        if (t.getPilhaTipos().get(t.getTopoExec()-1) == 4 && t.getPilhaTipos().get(t.getTopoExec() - 2) == 4) {
            String valor = Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec()-2)) && Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec()-1)) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec()-2, valor);
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao usar variaveis que não são do tipo booleano em uma instrução AND";
        }
    }

    public static void ldr(Tela2 t, String constante) {
        t.getPilhaExec().addLast(constante);
        t.getPilhaTipos().addLast(2);
        t.setTopoExec(t.getTopoExec() + 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void lds(Tela2 t, String constante) {
        t.getPilhaExec().addLast(constante);
        t.getPilhaTipos().addLast(3);
        t.setTopoExec(t.getTopoExec() + 1);  // topo -> topo + 1
        t.setPonteiroExec(t.getPonteiroExec() + 1); // ponteiro -> ponteiro + 1
    }

    public static void mul(Tela2 t) {
        if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
            if(t.getPilhaTipos().get(t.getTopoExec()-1) == 1){
                t.getPilhaExec().set(t.getTopoExec()-1,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-2)) * Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1))));
            }else{
                t.getPilhaExec().set(t.getTopoExec()-1,Float.toString(Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-2)) * Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1))));
            }
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void not(Tela2 t) {
        if(t.getPilhaTipos().get(t.getTopoExec()-1) == 4){
            boolean not1 = Boolean.parseBoolean(Integer.toString(t.getTopoExec()-1));
            t.getPilhaExec().set(t.getTopoExec()-1, Boolean.toString(!not1));
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao usar uma variavel que não é do tipo booleano em uma instrução NOT";
        }
    }

    public static void or(Tela2 t) {
        if (t.getPilhaTipos().get(t.getTopoExec()-1) == 4 && t.getPilhaTipos().get(t.getTopoExec()-2) == 4) {
            String valor = Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec()-2)) || Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec()-1)) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec()-2, valor);
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao usar variaveis que não são do tipo booleano em uma instrução OR";
        }
    }

    public static void sme(Tela2 t) {
        if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
            String valor = Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-2)) <= Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1)) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec()-2, valor);
            t.setTopoExec(t.getTopoExec() - 1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void smr(Tela2 t) {
        if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
            String valor = Float.parseFloat(t.getPilhaExec().get(t.getTopoExec() - 2)) < Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1)) ? "true" : "false";
            t.getPilhaExec().set(t.getTopoExec() - 2, valor);
            t.setTopoExec(t.getTopoExec() - 1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }

    public static void str(Tela2 t, int endereco) {
        if (Objects.equals(t.getPilhaTipos().get(endereco - 1), t.getPilhaTipos().get(t.getTopoExec() - 1))) {
            t.getPilhaExec().set(endereco - 1, t.getPilhaExec().get(t.getTopoExec() - 1));
            t.getPilhaExec().set(endereco - 1, t.getPilhaExec().get(t.getTopoExec() - 1));
            t.setTopoExec(t.getTopoExec() - 1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar salvar uma valor em uma variável de tipo incoerente.";
        }
    }

    public static void sub(Tela2 t){
        if((t.getPilhaTipos().get(t.getTopoExec()-2) == 1 && t.getPilhaTipos().get(t.getTopoExec()-1) == 1) || (t.getPilhaTipos().get(t.getTopoExec()-2) == 2 && t.getPilhaTipos().get(t.getTopoExec()-1) == 2)){
            if(t.getPilhaTipos().get(t.getTopoExec()-1) == 1){
                t.getPilhaExec().set(t.getTopoExec()-1,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-2)) - Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1))));
            }else{
                t.getPilhaExec().set(t.getTopoExec()-1,Float.toString(Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-2)) - Float.parseFloat(t.getPilhaExec().get(t.getTopoExec()-1))));
            }
            t.setTopoExec(t.getTopoExec()-1);
            t.getPilhaExec().removeLast();
            t.getPilhaTipos().removeLast();
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes ou incorretas.";
        }
    }
    public static void wrt(Tela2 t, Terminal terminal){
        terminal.write(t.getPilhaExec().get(t.getTopoExec()-1));
        t.setTopoExec(t.getTopoExec()-1);
        t.getPilhaExec().removeLast();
        t.getPilhaTipos().removeLast();
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }
    
    public static String getErroSemantico(){
        return erroSemantico;
    }
    
    public static void setErroSemantico(String err){
        erroSemantico = err;
    }

}
