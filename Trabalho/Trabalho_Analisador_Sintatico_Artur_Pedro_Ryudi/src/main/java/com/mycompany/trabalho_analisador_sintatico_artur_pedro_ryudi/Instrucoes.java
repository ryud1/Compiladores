package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;

public class Instrucoes {

    private static String erroSemantico = "";

    public static void add(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
            t.getPilhaExec().set(t.getTopoExec()-1,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) + Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()))));
            t.setTopoExec(t.getTopoExec()-1);
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar somar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void alb(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<t.getTopoExec()+ desl;i++){
            t.getPilhaExec().set(i, "false");
            t.getPilhaTipos().set(i, 4);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ali(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<t.getTopoExec()+ desl;i++){
            t.getPilhaExec().set(i, "0");
            t.getPilhaTipos().set(i, 1);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void alr(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<t.getTopoExec()+ desl;i++){
            t.getPilhaExec().set(i, "0.0");
            t.getPilhaTipos().set(i, 1);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void als(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()+1;i<t.getTopoExec()+ desl;i++){
            t.getPilhaExec().set(i, "");
            t.getPilhaTipos().set(i, 1);
        }
        t.setTopoExec(t.getTopoExec()+desl);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void stc(Tela2 t, Integer desl){
        for(int i=t.getTopoExec()-desl;i<t.getTopoExec()-1;i++){
            t.getPilhaExec().set(i, t.getPilhaExec().get(t.getTopoExec()));
        }
        t.setTopoExec(t.getTopoExec()-1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldi(Tela2 t, String constante){
        t.setTopoExec(t.getTopoExec()+1);
        t.getPilhaExec().set(t.getTopoExec(), constante);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldb(Tela2 t, String constante){
        t.setTopoExec(t.getTopoExec()+1);
        t.getPilhaExec().set(t.getTopoExec(), constante);
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void ldv(Tela2 t, Integer endereco){
        t.setTopoExec(t.getTopoExec()+1);
        t.getPilhaExec().set(t.getTopoExec(), t.getPilhaExec().get(endereco-1));
        t.setPonteiroExec(t.getPonteiroExec()+1);
    }

    public static void jmt(Tela2 t, Integer endereco){
        if(t.getPilhaExec().get(t.getTopoExec()) == "true"){
            t.setPonteiroExec(endereco);
        }else{
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }
        t.setTopoExec(t.getPonteiroExec()-1);
    }

    public static void bge(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) >= Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec()-1, valor);
        t.setTopoExec(t.getTopoExec()-1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void bgr(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) > Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec()-1, valor);
        t.setTopoExec(t.getTopoExec()-1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void dif(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) != Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec()-1, valor);
        t.setTopoExec(t.getTopoExec()-1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
        } else {
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void div(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
            if(t.getTopoExec() == '0'){
                erroSemantico = "Runtime error: divisão por 0";
                return;
            }
            t.getPilhaExec().set(t.getTopoExec()-1,Integer.toString(Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) / Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()))));
            t.setTopoExec(t.getTopoExec()-1);
            t.setPonteiroExec(t.getPonteiroExec()+1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar dividir duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void eql(Tela2 t){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec()-1)) == Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec()-1, valor);
        t.setTopoExec(t.getTopoExec()-1);
        t.setPonteiroExec(t.getPonteiroExec()+1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void jmf(Tela2 t, int endereco){
        if(t.getPilhaTipos().get(t.getTopoExec()) == t.getPilhaTipos().get(t.getTopoExec()-1)){
            if(t.getPilhaExec().get(t.getTopoExec()) == "false"){
                t.setPonteiroExec(endereco);
            }else{
                t.setPonteiroExec(t.getPonteiroExec()+1);
            }
            t.setTopoExec(t.getTopoExec()-1);
        }else{
            erroSemantico = "Não foi executado pois ocorreu um erro semântico ao tentar comparar duas variaveis e/ou constantes de tipos diferentes.";
        }
    }

    public static void rea(Tela2 t, Terminal terminal, int tipo){
        t.setTopoExec(t.getTopoExec()+1);
        terminal.askInput();
        while(t.getReturnTerminal() == ""){
        }
        t.setPonteiroExec(t.getPonteiroExec()+1);
        if(t.getPilhaTipos().get(t.getTopoExec()) != tipo){
            //escreva("RUNTIME ERROR")
            //HALT?
        }
    }

    //VOLTALHA

    public static void and(Tela2 t, String constante) {
        if (t.getPilhaTipos().get(t.getTopoExec()) == 4 && t.getPilhaTipos().get(t.getTopoExec() - 1) == 4) {
            t.getPilhaExec().set(t.getTopoExec() - 1, Boolean.toString(Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec() - 1)) && Boolean.parseBoolean(t.getPilhaExec().get(t.getTopoExec()))));
            t.setTopoExec(t.getTopoExec() - 1);
            t.setPonteiroExec(t.getPonteiroExec() + 1);
        }
    }

    public static void ldr(Tela2 t, String constante) {
        t.setTopoExec(t.getTopoExec() + 1);
        t.getPilhaExec().set(t.getTopoExec(), constante);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void lds(Tela2 t, String constante) {
        t.setTopoExec(t.getTopoExec() + 1);  // topo -> topo + 1
        t.getPilhaExec().set(t.getTopoExec(), constante);
        t.setPonteiroExec(t.getPonteiroExec() + 1); // ponteiro -> ponteiro + 1
    }

    public static void mul(Tela2 t) {
        int mult = (t.getTopoExec() - 1) * t.getTopoExec();
        t.getPilhaExec().set(t.getTopoExec() - 1, Integer.toString(mult));
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void not(Tela2 t) {
        boolean not1 = Boolean.parseBoolean(Integer.toString(t.getTopoExec()));
        t.getPilhaExec().set(t.getTopoExec(), Boolean.toString(!not1));
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void or(Tela2 t) {
        boolean or1 = Boolean.parseBoolean(Integer.toString(t.getTopoExec() - 1)) || Boolean.parseBoolean(Integer.toString(t.getTopoExec()));
        t.getPilhaExec().set(t.getTopoExec() - 1, Boolean.toString(or1));
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void sme(Tela2 t) {
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec() - 1)) <= Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec() - 1, valor);
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void smr(Tela2 t) {
        String valor = Integer.parseInt(t.getPilhaExec().get(t.getTopoExec() - 1)) < Integer.parseInt(t.getPilhaExec().get(t.getTopoExec())) ? "true" : "false";
        t.getPilhaExec().set(t.getTopoExec() - 1, valor);
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void str(Tela2 t, int endereco) {
        t.getPilhaExec().set(endereco + 1, Integer.toString(t.getTopoExec()));
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public static void stp(Tela2 t){
        return;
    }

    public static void sub(Tela2 t){
        t.getPilhaExec().set(t.getTopoExec()-1, Integer.toString((t.getTopoExec()-1) - t.getTopoExec()));
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }
    public static void wrt(Tela2 t){
        //ESCREVA (pilha[topo])
        t.setTopoExec(t.getTopoExec() - 1);
        t.setPonteiroExec(t.getPonteiroExec() + 1);
    }

    public String getErroSemantico(){
        return erroSemantico;
    }


}
