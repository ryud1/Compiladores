package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;

public class Instrucoes {

    private static String erroSemantico = "";

    public static void add(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
            t.getPilhaExec().set(t.getTopoExec()-1,t.getPilhaExec().get(t.getTopoExec()-1) + t.getPilhaExec().get(t.getTopoExec()));
            t.setTopoExec(t.getTopoExec()-1);
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void alb(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<t.getTopoExec()+ desl;i++){
            t.getPilhaExec().set(i, "FALSE");
            t.getPilhaTipos().set(i, 4);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public String getErroSemantico(){
        return erroSemantico;
    }


}
