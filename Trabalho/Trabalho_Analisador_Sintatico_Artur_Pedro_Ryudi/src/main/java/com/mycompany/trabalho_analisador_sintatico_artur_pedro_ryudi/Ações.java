package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;


public class Ações {
    public void acao1(Analisador_semantico as){
        as.addAreaInstrucoes(as.getPonteiro(), "STP", 0);
    }

    public void acao2(Analisador_semantico as){
        as.addtabelaSimbolos(as.getCurrentTokenImage(), "0", -1);
    }

    public void acao3(Analisador_semantico as){
        as.setContexto("Constante");
    }

    public void acao4(Analisador_semantico as){
        switch(as.getTipo()){
            case 1:
            case 5:
                as.addAreaInstrucoes(as.getPonteiro(),"ALI",as.getVp());
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 2:
            case 6:
                as.addAreaInstrucoes(as.getPonteiro(),"ALR",as.getVp());
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 3:
            case 7:
                as.addAreaInstrucoes(as.getPonteiro(),"ALS",as.getVp());
                as.setPonteiro(as.getPonteiro()+1);
                break;
            case 4:
                as.addAreaInstrucoes(as.getPonteiro(),"ALB",as.getVp());
                as.setPonteiro(as.getPonteiro()+1);
                break;

        }
        if(as.getTipo() >= 1 && as.getTipo() <= 4)
            as.setVp(0);       
    }

    public void acao5(Analisador_semantico as){
        switch(as.getTipo()){
            case 5:
                as.addAreaInstrucoes(as.getPonteiro(), "LDI", Integer.parseInt(as.getCurrentTokenImage()));
                break;
            case 6:
                as.addAreaInstrucoes(as.getPonteiro(), "LDR", Float.parseFloat(as.getCurrentTokenImage()));
                break;
            case 7:
                as.addAreaInstrucoes(as.getPonteiro(), "LDS", as.getKeyValueTabelaSimbolos(as.getCurrentTokenImage()));
                break;
        }
    }

}