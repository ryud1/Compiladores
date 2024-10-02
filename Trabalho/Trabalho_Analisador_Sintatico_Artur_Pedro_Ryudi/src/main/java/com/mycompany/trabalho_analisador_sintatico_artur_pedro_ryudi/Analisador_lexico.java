package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;
/* Generated By:JavaCC: Do not edit this line. Analisador_lexico.java */

import java.util.ArrayList;

public class Analisador_lexico implements Analisador_lexicoConstants {
    private ArrayList<String> LinhasErro;
    private ArrayList<String> ColunasErro;
    private ArrayList<String> TokensErro;

    public void limpaArrays() {
        LinhasErro = null;
        TokensErro = null;
        ColunasErro = null;
    }

    public String getColunasErro(int i) {
        return this.ColunasErro.get(i);
    }

    public String getLinhasErro(int i) {
        return this.LinhasErro.get(i);
    }

    public String getTokensErro(int i) {
        return this.TokensErro.get(i);
    }

    public int getSizeLinhasErro() {
        return this.LinhasErro.size();
    }

    public String Analisador_lexico() throws ParseException {
        if (LinhasErro == null) {
            LinhasErro = new ArrayList<String>();
            TokensErro = new ArrayList<String>();
            ColunasErro = new ArrayList<String>();
        }
        String texto = "";
        Token n;
        int linha, coluna;
        label_1: while (true) {
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case MAKE:
                case END:
                case CONST:
                case VAR:
                case GET:
                case PUT:
                case IF:
                case ELSE:
                case THEN:
                case INT:
                case REAL:
                case CHAR:
                case BOOL:
                case TRUE:
                case FALSE:
                case WHILE:
                case PONTO:
                case DOIS_PONTOS:
                case PONTO_E_VIRGULA:
                case ATRIBUICAO:
                case VIRGULA:
                case ABRE_PARENTESES:
                case FECHA_PARENTESES:
                case MAIS:
                case MENOS:
                case MULTIPLICACAO:
                case DIVISAO:
                case EXPONENCIAL:
                case DIVISAO_INTEIRA:
                case RESTO_DIVISAO_INTEIRA:
                case IGUAL:
                case DIFERENTE:
                case MENOR:
                case MAIOR:
                case MENOR_IGUAL:
                case MAIOR_IGUAL:
                case E_COMERCIAL:
                case BARRA_VERTICAL:
                case EXCLAMACAO:
                case IDENTIFICADOR:
                case CONSTANTES_INT:
                case CONSTANTES_FLOAT:
                case CONSTANTE_LITARAL_ASPAS:
                case CONSTANTE_LITARAL_APOSTROFO:
                case E_LEX_IDENTIFICADOR:
                case E_LEX_CONST_LIT:
                case E_LEX_NUMERO:
                case ERRO_LEXICO_SIMBOLO:
                case E_LEX_COM_BLOCO:
                    ;
                    break;
                default:
                    jj_la1[0] = jj_gen;
                    break label_1;
            }
            switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
                case MAKE:
                jj_consume_token(MAKE);
                texto += "Palavra reservada: MAKE\n";
                break;
                case END:
                    jj_consume_token(END);
                    texto += "Palavra reservada: END\n";
                    break;
                case CONST:
                    jj_consume_token(CONST);
                    texto += "Palavra reservada: CONST\n";
                    break;
                case VAR:
                    jj_consume_token(VAR);
                    texto += "Palavra reservada: VAR\n";
                    break;
                case GET:
                    jj_consume_token(GET);
                    texto += "Palavra reservada: GET\n";
                    break;
                case PUT:
                    jj_consume_token(PUT);
                    texto += "Palavra reservada: PUT\n";
                    break;
                case IF:
                    jj_consume_token(IF);
                    texto += "Palavra reservada: IF\n";
                    break;
                case ELSE:
                    jj_consume_token(ELSE);
                    texto += "Palavra reservada: ELSE\n";
                    break;
                case THEN:
                    jj_consume_token(THEN);
                    texto += "Palavra reservada: THEN\n";
                    break;
                case INT:
                    jj_consume_token(INT);
                    texto += "Palavra reservada: INT\n";
                    break;
                case REAL:
                    jj_consume_token(REAL);
                    texto += "Palavra reservada: REAL\n";
                    break;
                case CHAR:
                    jj_consume_token(CHAR);
                    texto += "Palavra reservada: CHAR\n";
                    break;
                case BOOL:
                    jj_consume_token(BOOL);
                    texto += "Palavra reservada: BOOL\n";
                    break;
                case TRUE:
                    jj_consume_token(TRUE);
                    texto += "Palavra reservada: TRUE\n";
                    break;
                case FALSE:
                    jj_consume_token(FALSE);
                    texto += "Palavra reservada: FALSE\n";
                    break;
                case WHILE:
                    jj_consume_token(WHILE);
                    texto += "Palavra reservada: WHILE\n";
                    break;
                case PONTO:
                    jj_consume_token(PONTO);
                    texto += "Simbolo: PONTO\n";
                    break;
                case DOIS_PONTOS:
                    jj_consume_token(DOIS_PONTOS);
                    texto += "Simbolo: DOIS PONTOS\n";
                    break;
                case PONTO_E_VIRGULA:
                    jj_consume_token(PONTO_E_VIRGULA);
                    texto += "Simbolo: PONTO E VIRGULA\n";
                    break;
                case ATRIBUICAO:
                    jj_consume_token(ATRIBUICAO);
                    texto += "Simbolo: ATRIBUICAO\n";
                    break;
                case VIRGULA:
                    jj_consume_token(VIRGULA);
                    texto += "Simbolo: VIRGULA\n";
                    break;
                case ABRE_PARENTESES:
                    jj_consume_token(ABRE_PARENTESES);
                    texto += "Simbolo: ABRE PARENTESES\n";
                    break;
                case FECHA_PARENTESES:
                    jj_consume_token(FECHA_PARENTESES);
                    texto += "Simbolo: FECHA PARENTESES\n";
                    break;
                case MAIS:
                    jj_consume_token(MAIS);
                    texto += "Simbolo: MAIS\n";
                    break;
                case MENOS:
                    jj_consume_token(MENOS);
                    texto += "Simbolo: MENOS\n";
                    break;
                case MULTIPLICACAO:
                    jj_consume_token(MULTIPLICACAO);
                    texto += "Simbolo: MULTIPLICACAO\n";
                    break;
                case DIVISAO:
                    jj_consume_token(DIVISAO);
                    texto += "Simbolo: DIVISAO\n";
                    break;
                case EXPONENCIAL:
                    jj_consume_token(EXPONENCIAL);
                    texto += "Simbolo: EXPONENCIAL\n";
                    break;
                case DIVISAO_INTEIRA:
                    jj_consume_token(DIVISAO_INTEIRA);
                    texto += "Simbolo: DIVISAO INTEIRA\n";
                    break;
                case RESTO_DIVISAO_INTEIRA:
                    jj_consume_token(RESTO_DIVISAO_INTEIRA);
                    texto += "Simbolo: RESTO DIVISAO INTEIRA\n";
                    break;
                case IGUAL:
                    jj_consume_token(IGUAL);
                    texto += "Simbolo: IGUAL\n";
                    break;
                case DIFERENTE:
                    jj_consume_token(DIFERENTE);
                    texto += "Simbolo: DIFERENTE\n";
                    break;
                case MENOR:
                    jj_consume_token(MENOR);
                    texto += "Simbolo: MENOR\n";
                    break;
                case MAIOR:
                    jj_consume_token(MAIOR);
                    texto += "Simbolo: MAIOR\n";
                    break;
                case MENOR_IGUAL:
                    jj_consume_token(MENOR_IGUAL);
                    texto += "Simbolo: MENOR IGUAL\n";
                    break;
                case MAIOR_IGUAL:
                    jj_consume_token(MAIOR_IGUAL);
                    texto += "Simbolo: MAIOR IGUAL\n";
                    break;
                case E_COMERCIAL:
                    jj_consume_token(E_COMERCIAL);
                    texto += "Simbolo: E COMERCIAL\n";
                    break;
                case BARRA_VERTICAL:
                    jj_consume_token(BARRA_VERTICAL);
                    texto += "Simbolo: BARRA VERTICAL\n";
                    break;                
                case EXCLAMACAO:
                    jj_consume_token(EXCLAMACAO);
                    texto += "Simbolo: EXCLAMACAO\n";
                    break;
                case IDENTIFICADOR:
                    n = jj_consume_token(IDENTIFICADOR);
                    texto += "Identificador: " + n.image+ "\n";
                    break;
                case CONSTANTES_INT:
                    n = jj_consume_token(CONSTANTES_INT);
                    texto += "Numero int: " + n.image + "\n";
                    break;
                case CONSTANTES_FLOAT:
                    n = jj_consume_token(CONSTANTES_FLOAT);
                    texto += "Numero float: " + n.image+ "\n";
                    break;
                case CONSTANTE_LITARAL_ASPAS:
                    jj_consume_token(CONSTANTE_LITARAL_ASPAS);
                    texto += "Simbolo: CONST LIT ASPAS\n";
                    break;
                case CONSTANTE_LITARAL_APOSTROFO:
                    jj_consume_token(CONSTANTE_LITARAL_APOSTROFO);
                    texto += "Simbolo: CONST LIT APOSTROFO\n";
                    break;               
                case E_LEX_IDENTIFICADOR:
                    n = jj_consume_token(E_LEX_IDENTIFICADOR);
                    linha = jj_input_stream.retornalegal();
                    coluna = jj_input_stream.retornalegal2();
                    this.LinhasErro.add(linha + "");
                    this.ColunasErro.add(coluna + "");
                    this.TokensErro.add("Identificador inválido: " + n.image);
                    break;
                case E_LEX_CONST_LIT:
                    n = jj_consume_token(E_LEX_CONST_LIT);
                    linha = jj_input_stream.retornalegal();
                    coluna = jj_input_stream.retornalegal2();
                    this.LinhasErro.add(linha + "");
                    this.ColunasErro.add(coluna + "");
                    this.TokensErro.add("Constante literária inválida: " + n.image);
                    break; 
                case E_LEX_NUMERO:
                    n = jj_consume_token(E_LEX_NUMERO);
                    linha = jj_input_stream.retornalegal();
                    coluna = jj_input_stream.retornalegal2();
                    this.LinhasErro.add(linha + "");
                    this.ColunasErro.add(coluna + "");
                    this.TokensErro.add("Número inválido: " + n.image);
                    break;
                case ERRO_LEXICO_SIMBOLO:
                    n = jj_consume_token(ERRO_LEXICO_SIMBOLO);
                    linha = jj_input_stream.retornalegal();
                    coluna = jj_input_stream.retornalegal2();
                    this.LinhasErro.add(linha + "");
                    this.ColunasErro.add(coluna + "");
                    this.TokensErro.add("Símbolo inválido: " + n.image);
                    break;
                case E_LEX_COM_BLOCO:
                n = jj_consume_token(E_LEX_COM_BLOCO);
                linha = jj_input_stream.retornalegal();
                coluna = jj_input_stream.retornalegal2();
                this.LinhasErro.add(linha + "");
                this.ColunasErro.add(coluna + "");
                this.TokensErro.add("Comentario de bloco ficou aberto");
                break;
                default:
                    jj_la1[1] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
        }
        jj_consume_token(0);
        return texto;
    }

    static private boolean jj_initialized_once = false;
    /** Generated Token Manager. */
    static public Analisador_lexicoTokenManager token_source;
    static SimpleCharStream jj_input_stream;
    /** Current token. */
    static public Token token;
    /** Next token. */
    static public Token jj_nt;
    static private int jj_ntk;
    static private int jj_gen;
    static final private int[] jj_la1 = new int[2];
    static private int[] jj_la1_0;
    static private int[] jj_la1_1;
    static {
        jj_la1_init_0();
        jj_la1_init_1();
     }
     private static void jj_la1_init_0() {
        jj_la1_0 = new int[] {0xffffff80,0xffffff80,};
     }
     private static void jj_la1_init_1() {
        jj_la1_1 = new int[] {0xffffff,0xffffff,};
     }
  
    /** Constructor with InputStream. */
    public Analisador_lexico(java.io.InputStream stream) {
       this(stream, null);
    }
    /** Constructor with InputStream and supplied encoding */
    public Analisador_lexico(java.io.InputStream stream, String encoding) {
      if (jj_initialized_once) {
        System.out.println("ERROR: Second call to constructor of static parser.  ");
        System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
        System.out.println("       during parser generation.");
        throw new Error();
      }
      jj_initialized_once = true;
      try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
      token_source = new Analisador_lexicoTokenManager(jj_input_stream);
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    /** Reinitialise. */
    static public void ReInit(java.io.InputStream stream) {
       ReInit(stream, null);
    }
    /** Reinitialise. */
    static public void ReInit(java.io.InputStream stream, String encoding) {
      try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
      token_source.ReInit(jj_input_stream);
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    /** Constructor. */
    public Analisador_lexico(java.io.Reader stream) {
      if (jj_initialized_once) {
        System.out.println("ERROR: Second call to constructor of static parser. ");
        System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
        System.out.println("       during parser generation.");
        throw new Error();
      }
      jj_initialized_once = true;
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
      token_source = new Analisador_lexicoTokenManager(jj_input_stream);
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    /** Reinitialise. */
    static public void ReInit(java.io.Reader stream) {
      jj_input_stream.ReInit(stream, 1, 1);
      token_source.ReInit(jj_input_stream);
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    /** Constructor with generated Token Manager. */
    public Analisador_lexico(Analisador_lexicoTokenManager tm) {
      if (jj_initialized_once) {
        System.out.println("ERROR: Second call to constructor of static parser. ");
        System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
        System.out.println("       during parser generation.");
        throw new Error();
      }
      jj_initialized_once = true;
      token_source = tm;
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    /** Reinitialise. */
    public void ReInit(Analisador_lexicoTokenManager tm) {
      token_source = tm;
      token = new Token();
      jj_ntk = -1;
      jj_gen = 0;
      for (int i = 0; i < 2; i++) jj_la1[i] = -1;
    }
  
    static private Token jj_consume_token(int kind) throws ParseException {
      Token oldToken;
      if ((oldToken = token).next != null) token = token.next;
      else token = token.next = token_source.getNextToken();
      jj_ntk = -1;
      if (token.kind == kind) {
        jj_gen++;
        return token;
      }
      token = oldToken;
      jj_kind = kind;
      throw generateParseException();
    }
  
  
  /** Get the next Token. */
    static final public Token getNextToken() {
      if (token.next != null) token = token.next;
      else token = token.next = token_source.getNextToken();
      jj_ntk = -1;
      jj_gen++;
      return token;
    }
  
  /** Get the specific Token. */
    static final public Token getToken(int index) {
      Token t = token;
      for (int i = 0; i < index; i++) {
        if (t.next != null) t = t.next;
        else t = t.next = token_source.getNextToken();
      }
      return t;
    }
  
    static private int jj_ntk() {
      if ((jj_nt=token.next) == null)
        return (jj_ntk = (token.next=token_source.getNextToken()).kind);
      else
        return (jj_ntk = jj_nt.kind);
    }
  
    static private java.util.List jj_expentries = new java.util.ArrayList();
    static private int[] jj_expentry;
    static private int jj_kind = -1;
  
    /** Generate ParseException. */
    static public ParseException generateParseException() {
      jj_expentries.clear();
      boolean[] la1tokens = new boolean[56];
      if (jj_kind >= 0) {
        la1tokens[jj_kind] = true;
        jj_kind = -1;
      }
      for (int i = 0; i < 2; i++) {
        if (jj_la1[i] == jj_gen) {
          for (int j = 0; j < 32; j++) {
            if ((jj_la1_0[i] & (1<<j)) != 0) {
              la1tokens[j] = true;
            }
            if ((jj_la1_1[i] & (1<<j)) != 0) {
              la1tokens[32+j] = true;
            }
          }
        }
      }
      for (int i = 0; i < 56; i++) {
        if (la1tokens[i]) {
          jj_expentry = new int[1];
          jj_expentry[0] = i;
          jj_expentries.add(jj_expentry);
        }
      }
      int[][] exptokseq = new int[jj_expentries.size()][];
      for (int i = 0; i < jj_expentries.size(); i++) {
        exptokseq[i] = (int[])jj_expentries.get(i);
      }
      return new ParseException(token, exptokseq, tokenImage);
    }
  
    /** Enable tracing. */
    static final public void enable_tracing() {
    }
  
    /** Disable tracing. */
    static final public void disable_tracing() {
    }
  
  }
