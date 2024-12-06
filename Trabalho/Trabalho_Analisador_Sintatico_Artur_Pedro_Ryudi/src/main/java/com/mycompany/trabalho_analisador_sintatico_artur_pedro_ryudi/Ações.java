package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;


public class Ações {

    public static void acao1(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "STP", "0");
    }

    public static void acao2(Analisador_semantico as){
        as.addtabelaSimbolos(as.getCurrentTokenImage(), "0", -1);
    }

    public static void acao3(Analisador_semantico as){
        as.setContexto("Constante");
    }

    public static void acao4(Analisador_semantico as){
        switch(as.getTipo()){
            case 1:
            case 5:
                as.addAreaInstrucoes(as.getPonteiro(),"ALI", Integer.toString(as.getVp()));
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 2:
            case 6:
                as.addAreaInstrucoes(as.getPonteiro(),"ALR",Integer.toString(as.getVp()));
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 3:
            case 7:
                as.addAreaInstrucoes(as.getPonteiro(),"ALS",Integer.toString(as.getVp()));
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 4:
                as.addAreaInstrucoes(as.getPonteiro(),"ALB",Integer.toString(as.getVp()));
                as.setPonteiro(as.getPonteiro()+1);
                break;

        }
        if(as.getTipo() >= 1 && as.getTipo() <= 4)
            as.setVp(0);       
    }

    public static void acao5(Analisador_semantico as) throws ParseException{
        switch(as.getTipo()){
            case 5:
                try{
                    int aux = Integer.parseInt(as.getCurrentTokenImage());
                }catch(Exception e){
                    as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Tipo invalido para atribuição de constante");
                    throw new ParseException();
                }
                as.addAreaInstrucoes(as.getPonteiro(), "LDI",as.getCurrentTokenImage());
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 6:
                try{
                    Float aux = Float.parseFloat(as.getCurrentTokenImage());
                }catch(Exception e){
                    as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Tipo invalido para atribuição de constante");
                    throw new ParseException();
                }
                as.addAreaInstrucoes(as.getPonteiro(), "LDR", as.getCurrentTokenImage());
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 7:
                if((as.getCurrentTokenImage().substring(0, 1).equals("\"") && as.getCurrentTokenImage().substring(as.getCurrentTokenImage().length()-1, as.getCurrentTokenImage().length()).equals("\"")) 
                        || (as.getCurrentTokenImage().substring(0, 1).equals("'") && as.getCurrentTokenImage().substring(as.getCurrentTokenImage().length()-1, as.getCurrentTokenImage().length()).equals("'"))){
                    as.addAreaInstrucoes(as.getPonteiro(), "LDS", as.getCurrentTokenImage());
                    as.setPonteiro(as.getPonteiro()+1);
                    break;
                }else{
                    as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Tipo invalido para atribuição de constante");
                    throw new ParseException();
                }
        }
        as.addAreaInstrucoes(as.getPonteiro(), "STC", Integer.toString(as.getVp()));
        as.setPonteiro(as.getPonteiro()+1);
        as.setVp(0);
    }

    public static void acao6(Analisador_semantico as){
        as.setContexto("Variavel");
    }

    public static void acao7(Analisador_semantico as){
        if(as.getContexto().equals("Variavel")){
            as.setTipo(1);
        }else{
            as.setTipo(5);
        }
    }

    public static void acao8(Analisador_semantico as){
        if(as.getContexto().equals("Variavel")){
            as.setTipo(2);
        }else{
            as.setTipo(6);
        }
    }

    public static void acao9(Analisador_semantico as){
        if(as.getContexto().equals("Variavel")){
            as.setTipo(3);
        }else{
            as.setTipo(7);
        }
    }

    public static void acao10(Analisador_semantico as) throws ParseException {
        if(as.getContexto().equals("Variavel")){
            as.setTipo(4);
        }else{
            //erro: "tipo invalido para constante"
            as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Tipo invalido para constante");
            throw new ParseException();
        }
    }

    public static void acao11(Analisador_semantico as) throws ParseException{
        switch (as.getContexto()) {
            case "Constante":
            case "Variavel":
                if (as.existTabelaSimbolos(as.getCurrentTokenImage())) {
                    //erro: “identificador já declarado”    
                    as.setErroSemantico("erro semântico na linha "+ as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador já declarado");
                    throw new ParseException();
                }
                else{
                    as.setVt(as.getVt()+1);
                    as.setVp(as.getVp()+1);
                    as.addtabelaSimbolos(as.getCurrentTokenImage(), Integer.toString(as.getTipo()), as.getVt());
                }
                break;
            case "Entrada Dados":
                if(as.existTabelaSimbolos(as.getCurrentTokenImage())){
                    if(as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("1")
                    ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("2")
                    ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("3")
                    ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("4")){
                        as.addAreaInstrucoes(as.getPonteiro(), "REA", as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria());
                        as.setPonteiro(as.getPonteiro()+1);
                        as.addAreaInstrucoes(as.getPonteiro(), "STR",Integer.toString(as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getAtributo()));
                        as.setPonteiro(as.getPonteiro()+1);
                    }else{
                        //erro:  “identificador de programa ou de constante”
                        as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador de programa ou de constante");
                        throw new ParseException();
                    }
                }
                else{
                    //erro: “identificador não declarado”
                    as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador não declarado");
                    throw new ParseException();
                } 
        }
    }

    public static void acao12(Analisador_semantico as) throws ParseException {
        if(as.existTabelaSimbolos(as.getCurrentTokenImage())){
            if(as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("1")
            ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("2")
            ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("3")
            ||as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("4")){
                as.addAreaInstrucoes(as.getPonteiro(), "STR",Integer.toString(as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getAtributo()));
                as.setPonteiro(as.getPonteiro()+1);
            }else{
                //erro:  “identificador de programa ou de constante”
                as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador de programa ou de constante");
                throw new ParseException();
                
            }
        }
        else{
            //erro: “identificador não declarado”
            as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador não declarado");
            throw new ParseException();
        } 
    }

    public static void acao13(Analisador_semantico as){
        as.setContexto("Entrada Dados");
    }
    public static void acao14(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "WRT", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }


    public static void acao15(Analisador_semantico as) throws ParseException {
        if(as.existTabelaSimbolos(as.getCurrentTokenImage())){
            if(!as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage()).getCategoria().equals("0")){
                Simbolo curToken = as.getKeySimbolTabelaSimbolos(as.getCurrentTokenImage());
                as.addAreaInstrucoes(as.getPonteiro(), "LDV", Integer.toString(curToken.getAtributo()));
                as.setPonteiro(as.getPonteiro()+1);
            }else{
                //erro: "identificador de programa"
                as.setErroSemantico("erro semântico na linha "+ as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador de programa");
                throw new ParseException();
            }
        }else{
            //erro:"identificador nao declarado"
            as.setErroSemantico("erro semântico na linha "+  as.token.beginLine +", coluna "+ as.token.beginColumn +": Identificador nao declarado");
            throw new ParseException();
        }
    }

    public static void acao16(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "LDI", as.getCurrentTokenImage());
        as.setPonteiro(as.getPonteiro()+1);
    }

    public static void acao17(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "LDR", as.getCurrentTokenImage());
        as.setPonteiro(as.getPonteiro()+1);
    }

    public static void acao18(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "LDS", as.getCurrentTokenImage().replace("\"", "").replace("'", ""));
        as.setPonteiro(as.getPonteiro()+1);
    }
    
    public static void acao19(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "LDB", "true");
        as.setPonteiro(as.getPonteiro()+1);
    }

    public static void acao20(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "LDB", "false");
        as.setPonteiro(as.getPonteiro()+1);
    }

    public static void acao21(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "JMF", "?");
        as.setPonteiro(as.getPonteiro()+1);
        as.empilharDesvios(as.getPonteiro()-1);
    }

    public static void acao22(Analisador_semantico as){
        int dado = as.desempilharPilhaDesvios();
        as.getInstrucaoAreaInstrucoes(dado).setParam(Integer.toString(as.getPonteiro()));
    }

    public static void acao23(Analisador_semantico as){
        int dado = as.desempilharPilhaDesvios();
        as.getInstrucaoAreaInstrucoes(dado).setParam(Integer.toString(as.getPonteiro()+1));
        as.addAreaInstrucoes(as.getPonteiro(), "JMP", "?");
        as.setPonteiro(as.getPonteiro()+1);
        as.empilharDesvios(as.getPonteiro()-1);
    }

    public static void acao24(Analisador_semantico as){
        as.empilharDesvios(as.getPonteiro());
    }
    public static void acao25(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "JMF", "?");
        as.setPonteiro(as.getPonteiro()+1);
        as.empilharDesvios(as.getPonteiro()-1);
    }
    public static void acao26(Analisador_semantico as){
        int dado25 = as.desempilharPilhaDesvios();
        as.getInstrucaoAreaInstrucoes(dado25).setParam(Integer.toString(as.getPonteiro()+1));
        int dado24 = as.desempilharPilhaDesvios();
        as.addAreaInstrucoes(as.getPonteiro(), "JMP",Integer.toString(dado24));
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao27(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "EQL", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao28(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "DIF", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao29(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "SMR", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao30(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "BGR", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao31(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "SME", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao32(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "BGE", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao33(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "ADD", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao34(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "SUB", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao35(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "OR", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao36(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "MUL", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao37(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "DIV", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao38(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "DI", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao39(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "RDI", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao40(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "AND", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao41(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "POT", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
    public static void acao42(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "NOT", "0");
        as.setPonteiro(as.getPonteiro()+1);
    }
}