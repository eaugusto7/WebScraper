/*
 PROJETO WEB SCRAPER A PARTIR DO E-COMMERCE SUBMARINO
 NOME: Eduardo Augusto de Oliveira Borges
 */
package br.com.eduardoaugusto.webscraper; //Nome do pacote do projeto

//Importação de bibliotecas
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela extends javax.swing.JFrame { //Inicio da classe Tela
    //Declaração de Variáveis

    public String nomedoproduto;
    public String valordoproduto;
    public String descricaoproduto;
    public ArrayList fichatecnica;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextArea fTecnica;
    private javax.swing.JLabel fichaTecnica;
    private java.awt.Panel imagem;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea nProduto;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel tituloPrograma;
    private javax.swing.JTextArea vProduto;
    private javax.swing.JLabel valorProduto;

    //Contrutor da classe Tela
    public Tela(String nomedoproduto, String valordoproduto, String descricaoproduto, ArrayList fichatecnica) {
        this.nomedoproduto = nomedoproduto;
        this.valordoproduto = valordoproduto;
        this.descricaoproduto = descricaoproduto;
        this.fichatecnica = fichatecnica;
        initComponents();
    }

    //Get da variavel nomedoproduto
    public String getNomedoproduto() {
        return nomedoproduto;
    }

    //Set da variavel nomedoproduto
    public void setNomedoproduto(String nomedoproduto) {
        this.nomedoproduto = nomedoproduto;
    }

    //Get da variavel valordoproduto
    public String getValordoproduto() {
        return valordoproduto;
    }

    //Set da variavel valordoproduto
    public void setValordoproduto(String valordoproduto) {
        this.valordoproduto = valordoproduto;
    }

    //Get da variavel descricaoproduto
    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    //Set da variavel descricaoproduto
    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    //Get da variavel fichatecnica
    public ArrayList getFichatecnica() {
        return fichatecnica;
    }

    //Set da variavel fichatecnica
    public void setFichatecnica(ArrayList fichatecnica) {
        this.fichatecnica = fichatecnica;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        //Inicialização do componentes utilizados no JFrame
        tituloPrograma = new javax.swing.JLabel();
        imagem = new java.awt.Panel();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        nProduto = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        vProduto = new javax.swing.JTextArea();
        nomeProduto = new javax.swing.JLabel();
        valorProduto = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        fichaTecnica = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        fTecnica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //Finaliza a execução ao o usuário encerrar o JFrame

        tituloPrograma.setFont(new java.awt.Font("Dialog", 1, 18));
        tituloPrograma.setText("Web Scraper"); //Define o titulo a janela JFrame

        //Adiciona Janelas ao GroupLayout presente no JFrame
        javax.swing.GroupLayout imagemLayout = new javax.swing.GroupLayout(imagem);
        imagem.setLayout(imagemLayout);
        imagemLayout.setHorizontalGroup(
                imagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 200, Short.MAX_VALUE)
        );
        imagemLayout.setVerticalGroup(
                imagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );

        desc.setEditable(false); //Define que o espaço de descrição do produto não pode ser editado pelo usuário
        desc.setColumns(20);
        desc.setRows(5);
        desc.setText(this.getDescricaoproduto());
        desc.setLineWrap(true);
        jScrollPane3.setViewportView(desc);

        nProduto.setEditable(false); //Define que o espaço do nome do produto não pode ser editado pelo usuário
        nProduto.setColumns(20);
        nProduto.setRows(5);
        nProduto.setLineWrap(true);
        nProduto.setText(this.getNomedoproduto());
        jScrollPane4.setViewportView(nProduto);

        vProduto.setEditable(false); //Define que o espaço do valor do produto não pode ser editado pelo usuário
        vProduto.setColumns(20);
        vProduto.setRows(5);
        vProduto.setText(this.getValordoproduto());
        jScrollPane5.setViewportView(vProduto);

        fTecnica.setEditable(false); //Define que o espaço do valor do produto não pode ser editado pelo usuário
        fTecnica.setColumns(20);
        fTecnica.setRows(5);

        nomeProduto.setText("Produto"); //Define o texto para a correspondente Label
        valorProduto.setText("Valor"); //Define o texto para a correspondente Label
        descricao.setText("Descricao"); //Define o texto para a correspondente Label
        fichaTecnica.setText("Ficha Tecnica"); //Define o texto para a correspondente Label

        for (int i = 0; i < this.fichatecnica.size(); i++) {
            fTecnica.setText(fTecnica.getText() + this.fichatecnica.get(i).toString()); //Define o texto do campo ficha técnica
        }
        jScrollPane6.setViewportView(fTecnica);

        //Adiciona todas as telas a Janela que será exibida
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(fichaTecnica)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(descricao)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(nomeProduto)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(tituloPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(valorProduto))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valorProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(fichaTecnica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
        );
        pack();
    }
}
