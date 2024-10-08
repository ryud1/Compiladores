/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalho_analisador_sintatico_artur_pedro_ryudi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Caret;

/**
 *
 * @author Bebeto
 */
public class Tela extends javax.swing.JFrame {

    /**
     */
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Compilador");
        this.setPainelEditavel("");
    }

    public void setPainelEditavel(String text){
        painelEditavel.setText(text);
    }

    private String resultado;

    private String painelTextSaved;
    private String selectPainelEditavel;
    private String bufferPainelEditavel;

    public String getPainelTextSaved() {
        return painelTextSaved;
    }

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setPainelTextSaved(String painelTextSaved) {
        this.painelTextSaved = painelTextSaved;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void returnLineError(){

    }
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelEditavel = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        terminal = new javax.swing.JTextArea();
        ContadorLC = new javax.swing.JLabel();
        nomeArquivo = new javax.swing.JLabel();
        Icon icon = new ImageIcon("./src/main/java/com/mycompany/trabalho_analisador_sintatico_artur_pedro_ryudi/gerramenta 32bit.png");
        botaoCompilar = new JButton(icon);
        Icon icon2 = new ImageIcon("./src/main/java/com/mycompany/trabalho_analisador_sintatico_artur_pedro_ryudi/PLAY.png");
        botaoExecutar = new JButton(icon2);
        jMenuBar1 = new javax.swing.JMenuBar();
        listaArquivo = new javax.swing.JMenu();
        botaoNovo = new javax.swing.JMenuItem();
        botaoAbrir = new javax.swing.JMenuItem();
        botaoSalvar = new javax.swing.JMenuItem();
        botaoSalvarComo = new javax.swing.JMenuItem();
        botaoSair = new javax.swing.JMenuItem();
        listaEdição = new javax.swing.JMenu();
        botaoCopiar = new javax.swing.JMenuItem();
        botaoColar = new javax.swing.JMenuItem();
        botaoRecortar = new javax.swing.JMenuItem();
        listaCompilacao = new javax.swing.JMenu();
        botaoMenuCompilar = new javax.swing.JMenuItem();
        botaoMenuExecutar = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");
        painelEditavel.setLineWrap(false);
        painelEditavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                painelEditavelKeyReleased(evt);
            }
        });
        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jButton3.setText("Não");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(painelEditavel);

        terminal.setEditable(false);
        terminal.setColumns(20);
        terminal.setRows(5);
        jScrollPane3.setViewportView(terminal);

        ContadorLC.setText("Contador de linha e coluna");

        nomeArquivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeArquivo.setText("Nome do arquivo");
        nomeArquivo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        botaoCompilar.setAlignmentY(0.0F);
        botaoCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botaoCompilarActionPerformed(evt);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        botaoExecutar.setAlignmentY(0.0F);
        botaoExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExecutarActionPerformed(evt);
            }
        });

        botaoCopiar.setText("Copiar");
        botaoCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCopiarActionPerformed(evt);
            }
        });
        listaEdição.add(botaoCopiar);

        botaoColar.setText("Colar");
        botaoColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoColarActionPerformed(evt);
            }
        });
        listaEdição.add(botaoColar);

        botaoRecortar.setText("Recortar");
        botaoRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecortarActionPerformed(evt);
            }
        });

        painelEditavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEditavelMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelEditavelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botaoCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botaoExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ContadorLC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nomeArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botaoCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ContadorLC)
                                        .addComponent(nomeArquivo)))
        );

        listaArquivo.setText("Arquivo");

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        listaArquivo.add(botaoNovo);

        botaoAbrir.setText("Abrir");
        botaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });
        listaArquivo.add(botaoAbrir);

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        listaArquivo.add(botaoSalvar);

        botaoSalvarComo.setText("Salvar como");
        botaoSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarComoActionPerformed(evt);
            }
        });
        listaArquivo.add(botaoSalvarComo);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        listaArquivo.add(botaoSair);

        jMenuBar1.add(listaArquivo);

        listaEdição.setText("Edição");

        botaoRecortar.setText("Recortar");
        botaoRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecortarActionPerformed(evt);
            }
        });
        listaEdição.add(botaoRecortar);

        jMenuBar1.add(listaEdição);

        listaCompilacao.setText("Compilação");

        botaoMenuCompilar.setText("Compilar");
        botaoMenuCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botaoMenuCompilarActionPerformed(evt);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        listaCompilacao.add(botaoMenuCompilar);

        botaoMenuExecutar.setText("Executar");
        botaoMenuExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuExecutarActionPerformed(evt);
            }
        });
        listaCompilacao.add(botaoMenuExecutar);

        jMenuBar1.add(listaCompilacao);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {
       if(painelEditavel.getText().equals("")){
            painelEditavel.setText("");
            terminal.setText("");
        }
        else{
            this.setPainelTextSaved(painelEditavel.getText());
            Tela_Salvar telaSalvar = new Tela_Salvar(this,true, this.getPainelTextSaved());
            int salvar = telaSalvar.getSalvar();
            File file = telaSalvar.getFile();
            this.setFile(file);
            String texto = this.getPainelTextSaved();
            telaSalvar.setPainelTextSaved(texto);
            if(salvar == 0){
                this.painelTextSaved = painelEditavel.getText();
                painelEditavel.setText("");
                terminal.setText("");
                this.setFile(null);
            }if(salvar == 1){
                nomeArquivo.setText("Nome Arquivo");
                painelEditavel.setText("");
                terminal.setText("");
                this.setFile(null);
            }
        }
    }

    private void botaoCompilarActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringReader reader = new StringReader(painelEditavel.getText());
        if(this.analizador == null){
            this.analizador = new Analisador_lexico(reader);
        }else{
            analizador.ReInit(reader);
        }
        resultado = analizador.Analisador_lexico();
        terminal.setText(resultado);
        int qtdErros = analizador.getSizeLinhasErro();
        if(qtdErros > 0){
            if(qtdErros == 1){
                terminal.append("\nNão foi compilado pois ocorreu um erro.\n");
            }else{
                terminal.append("\nNão foi compilado pois ocorreram "+ analizador.getSizeLinhasErro()+" erros.\n");
            }
            for(int i=0;i<analizador.getSizeLinhasErro();i++){
                terminal.append("Erro lexico na linha: "+analizador.getLinhasErro(i)+" | coluna: "+analizador.getColunasErro(i)+" - "+analizador.getTokensErro(i)+"\n");
            }
        }else if(painelEditavel.getText().equals(""))
        {
            terminal.append("Nada a compilar.");
        }else{
            terminal.append("\nCompilado com sucesso!");
        }
        analizador.limpaArrays();
    }

    private void botaoExecutarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void botaoSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto (.txt)", "txt");
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        int res = fc.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            String filepath = arquivo.getPath();
            if (!filepath.toLowerCase().endsWith(".txt")) {
                arquivo = new File(filepath + ".txt");
            }

            if (arquivo.exists()) {
                int resposta = JOptionPane.showConfirmDialog(this,
                        "O arquivo já existe. Deseja sobrescrevê-lo?",
                        "Confirmar Sobrescrita",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);

                if (resposta == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            String filename = arquivo.getName();
            this.setFile(arquivo);
            this.nomeArquivo.setText(filename);

            try (FileWriter writer = new FileWriter(arquivo)) {
                String texto = painelEditavel.getText();
                writer.write(texto);
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");

                this.setTitle(arquivo.getName());
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ioException.getMessage());
            }
        }
    }


    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {
        if (painelEditavel.getText().equals("")) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto (.txt)", "txt");
            int res = fc.showOpenDialog(this);
            if (res == JFileChooser.APPROVE_OPTION) {
                File arquivo = fc.getSelectedFile();
                String fileName = arquivo.getName();
                String conteudo = "";
                try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        conteudo += line + "\n";
                    }
                    this.painelEditavel.setText(conteudo);
                    this.nomeArquivo.setText(fileName);
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: " + ioException.getMessage());
                }
                this.setFile(arquivo);
            }
        } else {
            this.setPainelTextSaved(painelEditavel.getText());
            Tela_Salvar telaSalvar = new Tela_Salvar(this, true, this.getPainelTextSaved());
            int salvar = telaSalvar.getSalvar();
            File file = telaSalvar.getFile();
            this.setFile(file);
            String texto = this.getPainelTextSaved();
            telaSalvar.setPainelTextSaved(texto);
            if (salvar == 0) {
                this.painelTextSaved = painelEditavel.getText();
                painelEditavel.setText("");
                terminal.setText("");
                this.setFile(null);
            }
            if (salvar == 1) {
                nomeArquivo.setText("Nome Arquivo");
                painelEditavel.setText("");
                terminal.setText("");
                this.setFile(null);
                JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto (.txt)", "txt");
                int res = fc.showOpenDialog(this);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File arquivo = fc.getSelectedFile();
                    String fileName = arquivo.getName();
                    String conteudo = "";
                    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            conteudo += line + "\n";
                        }
                        this.painelEditavel.setText(conteudo);
                        this.nomeArquivo.setText(fileName);
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: " + ioException.getMessage());
                    }
                    this.setFile(arquivo);
                }
            }
        }
    }
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        File file = this.getFile();
        if (file != null) {
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                JOptionPane.showMessageDialog(this, "Por favor, salve o arquivo com a extensão .txt");
                return;
            }

            try (FileWriter writer = new FileWriter(file)) {
                String texto = this.painelEditavel.getText();
                writer.write(texto);
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ioException.getMessage());
            }
        } else {
            JFileChooser fc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto (.txt)", "txt");
            fc.setFileFilter(filter);
            fc.setAcceptAllFileFilterUsed(false);

            int res = fc.showSaveDialog(this);
            if (res == JFileChooser.APPROVE_OPTION) {
                File arquivo = fc.getSelectedFile();
                String filepath = arquivo.getPath();

                if (!filepath.toLowerCase().endsWith(".txt")) {
                    arquivo = new File(filepath + ".txt");
                }

                this.setFile(arquivo);

                try (FileWriter writer = new FileWriter(arquivo)) {
                    String texto = painelEditavel.getText();
                    writer.write(texto);
                    JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ioException.getMessage());
                }
            }
        }
    }


    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {
        Tela_Salvar telaSalvar = new Tela_Salvar(this,true, this.getPainelTextSaved());
        int salvar = telaSalvar.getSalvar();
        int select = telaSalvar.getSelect();
        if(salvar == 0) {
            this.painelTextSaved = painelEditavel.getText();
            if(select == 1){
                this.dispose();
            }

        }else if(salvar == 1){
            this.dispose();
        }

    }


    private void botaoCopiarActionPerformed(java.awt.event.ActionEvent evt) {
        bufferPainelEditavel = selectPainelEditavel;
    }

    private void botaoColarActionPerformed(java.awt.event.ActionEvent evt) {
        painelEditavel.insert(bufferPainelEditavel,painelEditavel.getCaretPosition());
    }

    private void botaoRecortarActionPerformed(java.awt.event.ActionEvent evt) {
        bufferPainelEditavel = selectPainelEditavel;
        painelEditavel.replaceSelection("");
    }

    Analisador_lexico analizador;
    private void botaoMenuCompilarActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {
        StringReader reader = new StringReader(painelEditavel.getText());
        if(this.analizador == null){
            this.analizador = new Analisador_lexico(reader);
        }else{
            analizador.ReInit(reader);
        }
        resultado = analizador.Analisador_lexico();
        terminal.setText(resultado);
        int qtdErros = analizador.getSizeLinhasErro();
        if(qtdErros > 0){
            if(qtdErros == 1){
                terminal.append("\nOcorreu um erro.\n");
            }else{
                terminal.append("\nOcorreram "+ analizador.getSizeLinhasErro()+" erros.\n");
            }
            for(int i=0;i<analizador.getSizeLinhasErro();i++){
                terminal.append("Erro lexico na linha: "+analizador.getLinhasErro(i)+" | coluna: "+analizador.getColunasErro(i)+" - "+analizador.getTokensErro(i)+"\n");
            }
        }else if(painelEditavel.getText().equals(""))
        {
            terminal.append("Nada a compilar.");
        }else{
            terminal.append("\nCompilado com sucesso!");
        }
        analizador.limpaArrays();
    }

    private void botaoMenuExecutarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel ContadorLC;
    private javax.swing.JMenuItem botaoAbrir;
    private javax.swing.JMenuItem botaoColar;
    private javax.swing.JButton botaoCompilar;
    private javax.swing.JMenuItem botaoCopiar;
    private javax.swing.JButton botaoExecutar;
    private javax.swing.JMenuItem botaoMenuCompilar;
    private javax.swing.JMenuItem botaoMenuExecutar;
    private javax.swing.JMenuItem botaoNovo;
    private javax.swing.JMenuItem botaoRecortar;
    private javax.swing.JMenuItem botaoSair;
    private javax.swing.JMenuItem botaoSalvar;
    private javax.swing.JMenuItem botaoSalvarComo;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu listaArquivo;
    private javax.swing.JMenu listaCompilacao;
    private javax.swing.JMenu listaEdição;
    private javax.swing.JLabel nomeArquivo;
    private javax.swing.JTextArea painelEditavel;
    private javax.swing.JTextArea terminal;

    private void painelEditavelMouseClicked(java.awt.event.MouseEvent evt) {
        Caret pointer = painelEditavel.getCaret();
        if(pointer.getMagicCaretPosition() != null){
            String contador = "Linha: "
                    + (((pointer.getMagicCaretPosition().y)/16)+1)
                    + " | Coluna: "
                    + (((pointer.getMagicCaretPosition().x)/7)+1);
            ContadorLC.setText(contador);
        }
        selectPainelEditavel = painelEditavel.getSelectedText();
    }

    private void painelEditavelKeyReleased(java.awt.event.KeyEvent evt) {
        Caret pointer = painelEditavel.getCaret();
        if(pointer.getMagicCaretPosition() != null){
            String contador = "Linha: "
                + (((pointer.getMagicCaretPosition().y)/16)+1)
                + " | Coluna: "
                + (((pointer.getMagicCaretPosition().x)/7)+1);
            ContadorLC.setText(contador);
        }
        selectPainelEditavel = painelEditavel.getSelectedText();
    }

    private void painelEditavelMouseReleased(java.awt.event.MouseEvent evt) {
        Caret pointer = painelEditavel.getCaret();
        if(pointer.getMagicCaretPosition() != null){
            String contador = "Linha: "
                + (((pointer.getMagicCaretPosition().y)/16)+1)
                + " | Coluna: "
                + (((pointer.getMagicCaretPosition().x)/7)+1);
            ContadorLC.setText(contador);
        }
        selectPainelEditavel = painelEditavel.getSelectedText();
    }

}